using System;
using System.Collections;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Nov_Week1
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            btn_Popup.Click += BtnPopup_Click;
        }


        private void BtnPopup_Click(object sender, EventArgs e)
        {
            ArrayList arraylist = new ArrayList();
            if (chk_apple.Checked)
                arraylist.Add(chk_apple.Text);

            if (chk_pear.Checked)
                arraylist.Add(chk_pear.Text);

            if (chk_grape.Checked)
                arraylist.Add(chk_grape.Text);

            if (chk_straw.Checked)
                arraylist.Add(chk_straw.Text);

            MyPopupForm myPopupForm = new MyPopupForm(arraylist.ToArray());
            myPopupForm.ShowDialog();
        }
    }
}
