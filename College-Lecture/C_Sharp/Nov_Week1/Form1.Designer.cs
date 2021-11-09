
namespace Nov_Week1
{
    partial class Form1
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
            this.chk_apple = new System.Windows.Forms.CheckBox();
            this.chk_pear = new System.Windows.Forms.CheckBox();
            this.chk_grape = new System.Windows.Forms.CheckBox();
            this.chk_straw = new System.Windows.Forms.CheckBox();
            this.btn_Popup = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // chk_apple
            // 
            this.chk_apple.AutoSize = true;
            this.chk_apple.Location = new System.Drawing.Point(54, 66);
            this.chk_apple.Name = "chk_apple";
            this.chk_apple.Size = new System.Drawing.Size(50, 19);
            this.chk_apple.TabIndex = 0;
            this.chk_apple.Text = "사과";
            this.chk_apple.UseVisualStyleBackColor = true;
            // 
            // chk_pear
            // 
            this.chk_pear.AutoSize = true;
            this.chk_pear.Location = new System.Drawing.Point(134, 66);
            this.chk_pear.Name = "chk_pear";
            this.chk_pear.Size = new System.Drawing.Size(102, 19);
            this.chk_pear.TabIndex = 1;
            this.chk_pear.Text = "맛있는 겨울배";
            this.chk_pear.UseVisualStyleBackColor = true;
            // 
            // chk_grape
            // 
            this.chk_grape.AutoSize = true;
            this.chk_grape.Location = new System.Drawing.Point(357, 66);
            this.chk_grape.Name = "chk_grape";
            this.chk_grape.Size = new System.Drawing.Size(50, 19);
            this.chk_grape.TabIndex = 2;
            this.chk_grape.Text = "포도";
            this.chk_grape.UseVisualStyleBackColor = true;
            // 
            // chk_straw
            // 
            this.chk_straw.AutoSize = true;
            this.chk_straw.Location = new System.Drawing.Point(272, 66);
            this.chk_straw.Name = "chk_straw";
            this.chk_straw.Size = new System.Drawing.Size(50, 19);
            this.chk_straw.TabIndex = 3;
            this.chk_straw.Text = "딸기";
            this.chk_straw.UseVisualStyleBackColor = true;
            // 
            // btn_Popup
            // 
            this.btn_Popup.Location = new System.Drawing.Point(443, 61);
            this.btn_Popup.Name = "btn_Popup";
            this.btn_Popup.Size = new System.Drawing.Size(75, 23);
            this.btn_Popup.TabIndex = 4;
            this.btn_Popup.Text = "팝업";
            this.btn_Popup.UseVisualStyleBackColor = true;
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 15F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(576, 171);
            this.Controls.Add(this.btn_Popup);
            this.Controls.Add(this.chk_straw);
            this.Controls.Add(this.chk_grape);
            this.Controls.Add(this.chk_pear);
            this.Controls.Add(this.chk_apple);
            this.Name = "Form1";
            this.Text = "Form1";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.CheckBox chk_apple;
        private System.Windows.Forms.CheckBox chk_pear;
        private System.Windows.Forms.CheckBox chk_grape;
        private System.Windows.Forms.CheckBox chk_straw;
        private System.Windows.Forms.Button btn_Popup;
    }
}

