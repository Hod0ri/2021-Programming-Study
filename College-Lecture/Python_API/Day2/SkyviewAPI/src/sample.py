import json
from urllib.parse import urlencode, quote_plus
from urllib.request import urlopen, Request
import datetime
from bs4 import BeautifulSoup
from datetime import timedelta, time
import pandas as pd
from pandas.core.frame import DataFrame

# API Key를 가져오기 위한 외부 라이브러리 호출
from src import apiKey

# 현재 시각
now = datetime.datetime.now()
# 포맷에 맞춘 현재 날짜 (YYYYMMDD)
fullDate = now.strftime('%Y%m%d')
print(fullDate)

# 하루 전 날짜
before_one_day = now - timedelta(days=1)
# 포맷에 맞춘 어제 날짜
before_one_day = before_one_day.strftime('%Y%m%d')
print(before_one_day)

# 포맷에 맞춘 오늘 날짜 (MMDD)
nowDate = now.strftime('%m%d')

# 파일 이름 ir105_MMDD (현재 날짜 기준)
filename = 'ir105' + '_' + nowDate
print(nowDate)

# 공공데이터 API 주소 [ 기상청 위성영상 천리안 위성조회서비스 ]
url = 'http://apis.data.go.kr/1360000/SatlitImgInfoService/getInsightSatlit'

# ServiceKey = Decoding 인증키 사용

# API KEY를 불러오기 위한 Key객체 생성
Key = apiKey.API_KEY()
# API 키입력과 더불어 가져올 값 인코드
queryParams = '?' + urlencode(
    {quote_plus('ServiceKey'): Key.getKey(), quote_plus('pageNo'): '1', quote_plus('numOfRows'): '10',
     quote_plus('dataType'): 'JSON', quote_plus('sat'): 'G2', quote_plus('data'): 'ir105', quote_plus('area'): 'ko',
     quote_plus('time'): before_one_day})

# API 주소 + API 키를 URL로 한 Request 객체 생성
request = Request(url + queryParams)

# HTTP 요청 방식 'GET'
request.get_method = lambda: 'GET'

# Byte Data를 응답 받음 (60초가 지났음에도 응답이 되지 않을 경우 중지)
response_body = urlopen(request, timeout=60).read()
# Byte Data를 json으로 변환
data = json.loads(response_body)
# json 내용 출력
print(data)

# 생성된 ir105_MMDD에 내용 기입 (utf-8방식으로 인코딩, Ascii 보장 false, 들여쓰기 \t)
with open('./' + filename + '.json', 'w', encoding='utf-8') as file:
    json.dump(data, file, ensure_ascii=False, indent='\t')
