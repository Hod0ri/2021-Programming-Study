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
using QuizClassLibrary;

namespace PreviewQuiz
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            SetCombo();
            SetupView();
        }

        private void SetCombo()
        {
            cbBox.Items.Clear();
            cbBox.Items.Add("A");
            cbBox.Items.Add("B");
            cbBox.Items.Add("C");
        }

        private void SetupView()
        {
            dataView.ColumnCount = 3;
            dataView.Columns[0].Name = "학번";
            dataView.Columns[1].Name = "이름";
            dataView.Columns[2].Name = "성적";
        }

        private void Btn_Pro1_Click(object sender, EventArgs e)
        {
            ArrayList arraylist = new ArrayList();
            String stemp = tb_Fruit.Text;
            String[] result = stemp.Split(',');

            foreach(var item in result)
            {
                arraylist.Add(item);
            }

            Popup popup = new Popup(arraylist.ToArray());
            popup.ShowDialog();
        }

        private void btn_Pro2_Click(object sender, EventArgs e)
        {
            StringCompute strCompute = new StringCompute();
            String result = strCompute.Compute(textBox2.Text);
            textBox3.Text = result;
        }

        private void btn_Pro3_Click(object sender, EventArgs e)
        {
            dataView.Rows.Add(tb_No.Text, tb_Name.Text, cbBox.Text);
        }
    }
}
