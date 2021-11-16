using QuizClassLibrary;
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

namespace Quiz
{
    public partial class MainForm : Form
    {
        private Player[] players = new Player[10];
        int index = 0;
        
        public MainForm()
        {
            InitializeComponent();
            SetupView();
            SetCombo();
        }

        private void SetupView()
        {
            dataView.ColumnCount = 5;
            dataView.Columns[0].Name = "이름";
            dataView.Columns[1].Name = "공격";
            dataView.Columns[2].Name = "수비";
            dataView.Columns[3].Name = "패스";
            dataView.Columns[4].Name = "슛";
        }

        private void SetCombo()
        {
            cb_attack.Items.Clear();
            cb_attack.Items.Add("100");
            cb_attack.Items.Add("90");
            cb_attack.Items.Add("80");
            cb_attack.Items.Add("70");

            cb_defence.Items.Clear();
            cb_defence.Items.Add("100");
            cb_defence.Items.Add("90");
            cb_defence.Items.Add("80");
            cb_defence.Items.Add("70");

            cb_Pass.Items.Clear();
            cb_Pass.Items.Add("100");
            cb_Pass.Items.Add("90");
            cb_Pass.Items.Add("80");
            cb_Pass.Items.Add("70");

            cb_Shoot.Items.Clear();
            cb_Shoot.Items.Add("100");
            cb_Shoot.Items.Add("90");
            cb_Shoot.Items.Add("80");
            cb_Shoot.Items.Add("70");
        }

        private void btn_food_Click(object sender, EventArgs e)
        {
            ArrayList arraylist = new ArrayList();
            String stemp = tb_foods.Text;
            String[] result = stemp.Split(',');

            foreach (var item in result)
            {
                arraylist.Add(item);
            }

            ParamForm paramForm = new ParamForm(arraylist.ToArray());
            paramForm.ShowDialog();
        }

        private void btn_calc_Click(object sender, EventArgs e)
        {
            StringCompute strCompute = new StringCompute();
            String result = strCompute.Compute(tb_problem.Text);
            tb_result.Text = result;
        }

        private void btn_inputData_Click(object sender, EventArgs e)
        {
            int attack = int.Parse(cb_attack.Text);
            players[index] = new Player(tb_name.Text, int.Parse(cb_attack.Text), int.Parse(cb_defence.Text), int.Parse(cb_Pass.Text), int.Parse(cb_Shoot.Text));
            index++;
            dataView.Rows.Add(tb_name.Text, cb_attack.Text, cb_defence.Text, cb_Pass.Text, cb_Shoot.Text);
        }

        private void btn_view_Click(object sender, EventArgs e)
        {
            ChartView chart = new ChartView(players);
            chart.ShowDialog();
        }
    }
}
