using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace FoodSelector
{
    public partial class FoodSelector : Form
    {
        public FoodSelector()
        {
            InitializeComponent();
        }

        private void btn_Init_Click(object sender, EventArgs e)
        {
            result.Text = "";
            menulist.Text = "";
        }

        private void btn_Choice_Click(object sender, EventArgs e)
        {
            string stemp = menulist.Text;
            String[] menuR = stemp.Split(',');

            Random rand = new Random();
            int number = rand.Next(0, menuR.Length);

            result.Text = menuR[number].ToString();
        }
    }
}
