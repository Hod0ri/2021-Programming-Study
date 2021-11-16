using System;
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
    public partial class ParamForm : Form
    {
        public ParamForm()
        {
            InitializeComponent();
        }

        public ParamForm(object[] values) : this()
        {
            for (int index = 0; index < values.Length; index++)
            {
                listBox.Items.Add(values[index]);
            }
        }
    }
}
