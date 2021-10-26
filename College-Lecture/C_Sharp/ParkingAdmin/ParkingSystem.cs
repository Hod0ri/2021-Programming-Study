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
        }

        private void btnCarOut_Click_Click(object sender, EventArgs e)
        {
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
                    break;
                }
            }
            carNumberList.Remove(cboCarLList.Text);
            cboCarLList.Items.Clear();
            cboCarLList.Items.AddRange(carNumberList.ToArray());
            Console.WriteLine("현재 차량 대수: " + cars.Count);
        }
    }
}
