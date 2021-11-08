using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace PreviewQuiz
{
    public partial class Popup : Form
    {
        public Popup()
        {
            InitializeComponent();
        }

        public Popup(object[] values) : this()
        {
            for(int index = 0; index < values.Length; index++)
            {
                listBoxView.Items.Add(values[index]);
            }
        }
    }
}
