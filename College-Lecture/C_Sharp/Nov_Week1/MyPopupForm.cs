﻿using System;
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
    public partial class MyPopupForm : Form
    {
        public MyPopupForm()
        {
            InitializeComponent();
        }

        public MyPopupForm(object[] values) : this()
        {
            for(int i = 0; i < values.Length; i++)
            {
                listBox1.Items.Add(values[i]);
            }
        }
    }
}
