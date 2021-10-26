
namespace ParkingAdmin
{
    partial class ParkingSystem
    {
        /// <summary>
        ///  Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        ///  Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        ///  Required method for Designer support - do not modify
        ///  the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.btnCarIn_Click = new System.Windows.Forms.Button();
            this.btnCarOut_Click = new System.Windows.Forms.Button();
            this.cboCarLList = new System.Windows.Forms.ComboBox();
            this.listBoxState = new System.Windows.Forms.ListBox();
            this.SuspendLayout();
            // 
            // btnCarIn_Click
            // 
            this.btnCarIn_Click.Location = new System.Drawing.Point(269, 12);
            this.btnCarIn_Click.Name = "btnCarIn_Click";
            this.btnCarIn_Click.Size = new System.Drawing.Size(75, 23);
            this.btnCarIn_Click.TabIndex = 0;
            this.btnCarIn_Click.Text = "입차";
            this.btnCarIn_Click.UseVisualStyleBackColor = true;
            this.btnCarIn_Click.Click += new System.EventHandler(this.btnCarIn_Click_Click);
            // 
            // btnCarOut_Click
            // 
            this.btnCarOut_Click.Location = new System.Drawing.Point(362, 12);
            this.btnCarOut_Click.Name = "btnCarOut_Click";
            this.btnCarOut_Click.Size = new System.Drawing.Size(75, 23);
            this.btnCarOut_Click.TabIndex = 1;
            this.btnCarOut_Click.Text = "출차";
            this.btnCarOut_Click.UseVisualStyleBackColor = true;
            this.btnCarOut_Click.Click += new System.EventHandler(this.btnCarOut_Click_Click);
            // 
            // cboCarLList
            // 
            this.cboCarLList.FormattingEnabled = true;
            this.cboCarLList.Location = new System.Drawing.Point(12, 13);
            this.cboCarLList.Name = "cboCarLList";
            this.cboCarLList.Size = new System.Drawing.Size(251, 23);
            this.cboCarLList.TabIndex = 2;
            // 
            // listBoxState
            // 
            this.listBoxState.FormattingEnabled = true;
            this.listBoxState.ItemHeight = 15;
            this.listBoxState.Location = new System.Drawing.Point(12, 61);
            this.listBoxState.Name = "listBoxState";
            this.listBoxState.Size = new System.Drawing.Size(626, 349);
            this.listBoxState.TabIndex = 3;
            // 
            // ParkingSystem
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 15F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(666, 450);
            this.Controls.Add(this.listBoxState);
            this.Controls.Add(this.cboCarLList);
            this.Controls.Add(this.btnCarOut_Click);
            this.Controls.Add(this.btnCarIn_Click);
            this.Name = "ParkingSystem";
            this.Text = "Form1";
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Button btnCarIn_Click;
        private System.Windows.Forms.Button btnCarOut_Click;
        private System.Windows.Forms.ComboBox cboCarLList;
        private System.Windows.Forms.ListBox listBoxState;
    }
}

