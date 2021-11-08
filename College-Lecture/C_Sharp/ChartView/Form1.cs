using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Windows.Forms.DataVisualization.Charting;

namespace ChartView
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            myChart.Series.Clear();
            Series s1 = new Series("인구");
            string[] xValue = { "서울", "대전", "전주" };
            int[] yValue = { 10000, 3000, 2000 };
            s1.ChartType = SeriesChartType.Column;
            s1.Points.DataBindXY(xValue, yValue);
            myChart.Series.Add(s1);
        }
    }
}
