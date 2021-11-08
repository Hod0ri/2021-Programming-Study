
namespace PreviewQuiz
{
    partial class Form1
    {
        /// <summary>
        /// 필수 디자이너 변수입니다.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// 사용 중인 모든 리소스를 정리합니다.
        /// </summary>
        /// <param name="disposing">관리되는 리소스를 삭제해야 하면 true이고, 그렇지 않으면 false입니다.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form 디자이너에서 생성한 코드

        /// <summary>
        /// 디자이너 지원에 필요한 메서드입니다. 
        /// 이 메서드의 내용을 코드 편집기로 수정하지 마세요.
        /// </summary>
        private void InitializeComponent()
        {
            this.dataView = new System.Windows.Forms.DataGridView();
            this.Btn_Pro1 = new System.Windows.Forms.Button();
            this.btn_Pro2 = new System.Windows.Forms.Button();
            this.btn_Pro3 = new System.Windows.Forms.Button();
            this.label1 = new System.Windows.Forms.Label();
            this.tb_Fruit = new System.Windows.Forms.TextBox();
            this.textBox2 = new System.Windows.Forms.TextBox();
            this.textBox3 = new System.Windows.Forms.TextBox();
            this.tb_No = new System.Windows.Forms.TextBox();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.tb_Name = new System.Windows.Forms.TextBox();
            this.label4 = new System.Windows.Forms.Label();
            this.cbBox = new System.Windows.Forms.ComboBox();
            ((System.ComponentModel.ISupportInitialize)(this.dataView)).BeginInit();
            this.SuspendLayout();
            // 
            // dataView
            // 
            this.dataView.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataView.Location = new System.Drawing.Point(12, 288);
            this.dataView.Name = "dataView";
            this.dataView.RowTemplate.Height = 23;
            this.dataView.Size = new System.Drawing.Size(776, 150);
            this.dataView.TabIndex = 0;
            // 
            // Btn_Pro1
            // 
            this.Btn_Pro1.Location = new System.Drawing.Point(37, 65);
            this.Btn_Pro1.Name = "Btn_Pro1";
            this.Btn_Pro1.Size = new System.Drawing.Size(75, 23);
            this.Btn_Pro1.TabIndex = 1;
            this.Btn_Pro1.Text = "문제1";
            this.Btn_Pro1.UseVisualStyleBackColor = true;
            this.Btn_Pro1.Click += new System.EventHandler(this.Btn_Pro1_Click);
            // 
            // btn_Pro2
            // 
            this.btn_Pro2.Location = new System.Drawing.Point(37, 106);
            this.btn_Pro2.Name = "btn_Pro2";
            this.btn_Pro2.Size = new System.Drawing.Size(75, 23);
            this.btn_Pro2.TabIndex = 2;
            this.btn_Pro2.Text = "문제2";
            this.btn_Pro2.UseVisualStyleBackColor = true;
            this.btn_Pro2.Click += new System.EventHandler(this.btn_Pro2_Click);
            // 
            // btn_Pro3
            // 
            this.btn_Pro3.Location = new System.Drawing.Point(37, 198);
            this.btn_Pro3.Name = "btn_Pro3";
            this.btn_Pro3.Size = new System.Drawing.Size(75, 23);
            this.btn_Pro3.TabIndex = 3;
            this.btn_Pro3.Text = "문제3";
            this.btn_Pro3.UseVisualStyleBackColor = true;
            this.btn_Pro3.Click += new System.EventHandler(this.btn_Pro3_Click);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("굴림", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.label1.Location = new System.Drawing.Point(47, 153);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(53, 16);
            this.label1.TabIndex = 4;
            this.label1.Text = "Result";
            // 
            // tb_Fruit
            // 
            this.tb_Fruit.Location = new System.Drawing.Point(142, 66);
            this.tb_Fruit.Name = "tb_Fruit";
            this.tb_Fruit.Size = new System.Drawing.Size(445, 21);
            this.tb_Fruit.TabIndex = 5;
            // 
            // textBox2
            // 
            this.textBox2.Location = new System.Drawing.Point(142, 106);
            this.textBox2.Name = "textBox2";
            this.textBox2.Size = new System.Drawing.Size(445, 21);
            this.textBox2.TabIndex = 6;
            // 
            // textBox3
            // 
            this.textBox3.Location = new System.Drawing.Point(142, 154);
            this.textBox3.Name = "textBox3";
            this.textBox3.Size = new System.Drawing.Size(299, 21);
            this.textBox3.TabIndex = 7;
            // 
            // tb_No
            // 
            this.tb_No.Location = new System.Drawing.Point(211, 200);
            this.tb_No.Name = "tb_No";
            this.tb_No.Size = new System.Drawing.Size(126, 21);
            this.tb_No.TabIndex = 8;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("굴림", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.label2.Location = new System.Drawing.Point(156, 203);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(40, 16);
            this.label2.TabIndex = 9;
            this.label2.Text = "학번";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Font = new System.Drawing.Font("굴림", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.label3.Location = new System.Drawing.Point(349, 203);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(40, 16);
            this.label3.TabIndex = 11;
            this.label3.Text = "이름";
            // 
            // tb_Name
            // 
            this.tb_Name.Location = new System.Drawing.Point(404, 200);
            this.tb_Name.Name = "tb_Name";
            this.tb_Name.Size = new System.Drawing.Size(126, 21);
            this.tb_Name.TabIndex = 10;
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Font = new System.Drawing.Font("굴림", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.label4.Location = new System.Drawing.Point(547, 203);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(40, 16);
            this.label4.TabIndex = 13;
            this.label4.Text = "평점";
            // 
            // cbBox
            // 
            this.cbBox.FormattingEnabled = true;
            this.cbBox.Location = new System.Drawing.Point(593, 201);
            this.cbBox.Name = "cbBox";
            this.cbBox.Size = new System.Drawing.Size(121, 20);
            this.cbBox.TabIndex = 14;
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.cbBox);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.tb_Name);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.tb_No);
            this.Controls.Add(this.textBox3);
            this.Controls.Add(this.textBox2);
            this.Controls.Add(this.tb_Fruit);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.btn_Pro3);
            this.Controls.Add(this.btn_Pro2);
            this.Controls.Add(this.Btn_Pro1);
            this.Controls.Add(this.dataView);
            this.Name = "Form1";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "진호대 퀴즈";
            ((System.ComponentModel.ISupportInitialize)(this.dataView)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.DataGridView dataView;
        private System.Windows.Forms.Button Btn_Pro1;
        private System.Windows.Forms.Button btn_Pro2;
        private System.Windows.Forms.Button btn_Pro3;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.TextBox tb_Fruit;
        private System.Windows.Forms.TextBox textBox2;
        private System.Windows.Forms.TextBox textBox3;
        private System.Windows.Forms.TextBox tb_No;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.TextBox tb_Name;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.ComboBox cbBox;
    }
}

