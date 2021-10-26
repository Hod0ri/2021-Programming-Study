using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Collections;


namespace ParkingAdmin
{
    public partial class ParkingSystem : Form
    {
        ArrayList carNumberList;
        List<Car> cars = new List<Car>();
        Car car;
        int seq = 0;
        public ParkingSystem()
        {
            InitializeComponent();
            carNumberList = new ArrayList();
        }

        private void btnCarIn_Click_Click(object sender, EventArgs e)
        {
            foreach (var car in cars)
            {
                if (car.CarNumber.Contains(cboCarLList.Text))
                {
                    MessageBox.Show(car.CarNumber.ToString() + "는 이미 입고 되어 있습니다.");
                    return;
                }
            }
            car = new Car();
            car.Seq = ++seq;
            car.CarNumber = cboCarLList.Text;
            car.SetInTime();
            cars.Add(car);
            carNumberList.Add(cboCarLList.Text);
            cboCarLList.Items.Clear();
            cboCarLList.Items.AddRange(carNumberList.ToArray());

            StringBuilder sb = new StringBuilder();
            sb.Append("Car Number : ");
            sb.Append(cboCarLList.Text);
            sb.Append(" [ In Time ] ");
            sb.Append(car.GetInTime());

            listBoxState.Items.Add(sb.ToString());

            Console.WriteLine("현재 차량 대수 : " + cars.Count);
            int n = cboCarLList.Items.Count;
            lb_carC.Text = n.ToString();
        }

        private void btnCarOut_Click_Click(object sender, EventArgs e)
        {
            int price = 0;
            foreach (var car in cars)
            {
                if (car.CarNumber.Contains(cboCarLList.Text))
                {
                    car.SetOutTime();
                    StringBuilder sb = new StringBuilder();
                    sb.Append("Car Number : ");
                    sb.Append(cboCarLList.Text);
                    sb.Append(" [ In Time ] ");
                    sb.Append(car.GetInTime());
                    sb.Append(" [ Out Time ] ");
                    sb.Append(car.GetOutTime());
                    listBoxState.Items.Add(sb.ToString());
                    cars.Remove(car);

                    price = Price(car.GetInTime(), car.GetOutTime());

                    MessageBox.Show("출차\n입고 시간 : " + car.GetInTime().ToString() + "\n출고 시간 : " + car.GetOutTime().ToString() + "\n주차비 : " + price);

                    break;
                }
            }
            carNumberList.Remove(cboCarLList.Text);
            cboCarLList.Items.Clear();
            cboCarLList.Items.AddRange(carNumberList.ToArray());
            Console.WriteLine("현재 차량 대수: " + cars.Count);
            int n = cboCarLList.Items.Count;
            lb_carC.Text = n.ToString();

            int Price(DateTime inTime, DateTime outTime)
            {
                int result = 0;

                double oATimeIntervalValue = outTime.ToOADate() - inTime.ToOADate();
                DateTime TimeIntervalValue = DateTime.FromOADate(oATimeIntervalValue);
                int days = TimeIntervalValue.Day;
                int hours = TimeIntervalValue.Hour;
                int mins = TimeIntervalValue.Minute;
                int secons = TimeIntervalValue.Second;

                result = (hours * 3600) + (mins * 600) + (secons * 10);

                return result;
            }
        }
    }
}
