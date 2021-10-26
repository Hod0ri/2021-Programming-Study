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
        }
    }
}
