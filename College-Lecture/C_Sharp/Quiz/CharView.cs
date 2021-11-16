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

namespace Quiz
{
    public partial class ChartView : Form
    {
        public ChartView()
        {
            InitializeComponent();
        }
        int count = 0;
        public ChartView(object[] values) : this()
        {
            chart.Series.Clear();
            
            
            for (int i = 0; i < values.Length; i++)
            {
                Series[] serieses = new Series[values.Length];
                
                Player player = new Player();
                player = (Player)values[i];
                if(player is null)
                {
                    continue;
                }
                if (!string.IsNullOrEmpty(player.name))
                {
                    serieses[i] = new Series(player.name);
                    serieses[i].Points.AddXY("공격", player.attack);
                    serieses[i].Points.AddXY("수비", player.defence);
                    serieses[i].Points.AddXY("패스", player.pass);
                    serieses[i].Points.AddXY("슛", player.shoot);
                    if(count == 0)
                    {
                        serieses[0].ChartType = SeriesChartType.Radar;
                        count++;
                    }
                    
                    chart.Series.Add(serieses[i]);
                }
            }
        }


    }
}
