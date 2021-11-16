
namespace Quiz
{
    partial class MainForm
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
            this.panel1 = new System.Windows.Forms.Panel();
            this.panel2 = new System.Windows.Forms.Panel();
            this.label1 = new System.Windows.Forms.Label();
            this.btn_food = new System.Windows.Forms.Button();
            this.btn_calc = new System.Windows.Forms.Button();
            this.btn_inputData = new System.Windows.Forms.Button();
            this.btn_view = new System.Windows.Forms.Button();
            this.tb_foods = new System.Windows.Forms.TextBox();
            this.tb_problem = new System.Windows.Forms.TextBox();
            this.tb_result = new System.Windows.Forms.TextBox();
            this.label2 = new System.Windows.Forms.Label();
            this.dataView = new System.Windows.Forms.DataGridView();
            this.tb_name = new System.Windows.Forms.TextBox();
            this.label3 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.label5 = new System.Windows.Forms.Label();
            this.label6 = new System.Windows.Forms.Label();
            this.label7 = new System.Windows.Forms.Label();
            this.cb_attack = new System.Windows.Forms.ComboBox();
            this.cb_defence = new System.Windows.Forms.ComboBox();
            this.cb_Pass = new System.Windows.Forms.ComboBox();
            this.cb_Shoot = new System.Windows.Forms.ComboBox();
            this.panel1.SuspendLayout();
            this.panel2.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.dataView)).BeginInit();
            this.SuspendLayout();
            // 
            // panel1
            // 
            this.panel1.Controls.Add(this.cb_Shoot);
            this.panel1.Controls.Add(this.cb_Pass);
            this.panel1.Controls.Add(this.cb_defence);
            this.panel1.Controls.Add(this.cb_attack);
            this.panel1.Controls.Add(this.label7);
            this.panel1.Controls.Add(this.label6);
            this.panel1.Controls.Add(this.label5);
            this.panel1.Controls.Add(this.label4);
            this.panel1.Controls.Add(this.label3);
            this.panel1.Controls.Add(this.tb_name);
            this.panel1.Controls.Add(this.label2);
            this.panel1.Controls.Add(this.tb_result);
            this.panel1.Controls.Add(this.tb_problem);
            this.panel1.Controls.Add(this.tb_foods);
            this.panel1.Controls.Add(this.btn_view);
            this.panel1.Controls.Add(this.btn_inputData);
            this.panel1.Controls.Add(this.btn_calc);
            this.panel1.Controls.Add(this.btn_food);
            this.panel1.Controls.Add(this.label1);
            this.panel1.Dock = System.Windows.Forms.DockStyle.Top;
            this.panel1.Location = new System.Drawing.Point(0, 0);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(800, 288);
            this.panel1.TabIndex = 0;
            // 
            // panel2
            // 
            this.panel2.Controls.Add(this.dataView);
            this.panel2.Dock = System.Windows.Forms.DockStyle.Fill;
            this.panel2.Location = new System.Drawing.Point(0, 288);
            this.panel2.Name = "panel2";
            this.panel2.Size = new System.Drawing.Size(800, 162);
            this.panel2.TabIndex = 1;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("경기천년제목 Light", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.label1.Location = new System.Drawing.Point(12, 9);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(177, 21);
            this.label1.TabIndex = 0;
            this.label1.Text = "201830131 진호대";
            // 
            // btn_food
            // 
            this.btn_food.Font = new System.Drawing.Font("경기천년제목 Light", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.btn_food.Location = new System.Drawing.Point(16, 56);
            this.btn_food.Name = "btn_food";
            this.btn_food.Size = new System.Drawing.Size(124, 23);
            this.btn_food.TabIndex = 1;
            this.btn_food.Text = "좋아하는 음식";
            this.btn_food.UseVisualStyleBackColor = true;
            this.btn_food.Click += new System.EventHandler(this.btn_food_Click);
            // 
            // btn_calc
            // 
            this.btn_calc.Font = new System.Drawing.Font("경기천년제목 Light", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.btn_calc.Location = new System.Drawing.Point(16, 105);
            this.btn_calc.Name = "btn_calc";
            this.btn_calc.Size = new System.Drawing.Size(124, 23);
            this.btn_calc.TabIndex = 2;
            this.btn_calc.Text = "계산식 입력";
            this.btn_calc.UseVisualStyleBackColor = true;
            this.btn_calc.Click += new System.EventHandler(this.btn_calc_Click);
            // 
            // btn_inputData
            // 
            this.btn_inputData.Font = new System.Drawing.Font("경기천년제목 Light", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.btn_inputData.Location = new System.Drawing.Point(16, 170);
            this.btn_inputData.Name = "btn_inputData";
            this.btn_inputData.Size = new System.Drawing.Size(124, 23);
            this.btn_inputData.TabIndex = 3;
            this.btn_inputData.Text = "데이터 추가";
            this.btn_inputData.UseVisualStyleBackColor = true;
            this.btn_inputData.Click += new System.EventHandler(this.btn_inputData_Click);
            // 
            // btn_view
            // 
            this.btn_view.Font = new System.Drawing.Font("경기천년제목 Light", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.btn_view.Location = new System.Drawing.Point(16, 222);
            this.btn_view.Name = "btn_view";
            this.btn_view.Size = new System.Drawing.Size(82, 23);
            this.btn_view.TabIndex = 4;
            this.btn_view.Text = "차트 보기";
            this.btn_view.UseVisualStyleBackColor = true;
            this.btn_view.Click += new System.EventHandler(this.btn_view_Click);
            // 
            // tb_foods
            // 
            this.tb_foods.Location = new System.Drawing.Point(164, 58);
            this.tb_foods.Name = "tb_foods";
            this.tb_foods.Size = new System.Drawing.Size(567, 21);
            this.tb_foods.TabIndex = 5;
            // 
            // tb_problem
            // 
            this.tb_problem.Location = new System.Drawing.Point(164, 107);
            this.tb_problem.Name = "tb_problem";
            this.tb_problem.Size = new System.Drawing.Size(567, 21);
            this.tb_problem.TabIndex = 6;
            // 
            // tb_result
            // 
            this.tb_result.Location = new System.Drawing.Point(164, 143);
            this.tb_result.Name = "tb_result";
            this.tb_result.Size = new System.Drawing.Size(142, 21);
            this.tb_result.TabIndex = 7;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("경기천년제목 Light", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.label2.Location = new System.Drawing.Point(31, 143);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(67, 21);
            this.label2.TabIndex = 8;
            this.label2.Text = "Result";
            // 
            // dataView
            // 
            this.dataView.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataView.Location = new System.Drawing.Point(0, 0);
            this.dataView.Name = "dataView";
            this.dataView.RowTemplate.Height = 23;
            this.dataView.Size = new System.Drawing.Size(797, 159);
            this.dataView.TabIndex = 0;
            // 
            // tb_name
            // 
            this.tb_name.Location = new System.Drawing.Point(221, 172);
            this.tb_name.Name = "tb_name";
            this.tb_name.Size = new System.Drawing.Size(142, 21);
            this.tb_name.TabIndex = 9;
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Font = new System.Drawing.Font("경기천년제목 Light", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.label3.Location = new System.Drawing.Point(160, 172);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(44, 21);
            this.label3.TabIndex = 10;
            this.label3.Text = "이름";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(128, 227);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(29, 12);
            this.label4.TabIndex = 11;
            this.label4.Text = "공격";
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(277, 227);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(29, 12);
            this.label5.TabIndex = 12;
            this.label5.Text = "수비";
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Location = new System.Drawing.Point(431, 227);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(29, 12);
            this.label6.TabIndex = 13;
            this.label6.Text = "패스";
            // 
            // label7
            // 
            this.label7.AutoSize = true;
            this.label7.Location = new System.Drawing.Point(555, 227);
            this.label7.Name = "label7";
            this.label7.Size = new System.Drawing.Size(17, 12);
            this.label7.TabIndex = 14;
            this.label7.Text = "슛";
            // 
            // cb_attack
            // 
            this.cb_attack.FormattingEnabled = true;
            this.cb_attack.Location = new System.Drawing.Point(164, 224);
            this.cb_attack.Name = "cb_attack";
            this.cb_attack.Size = new System.Drawing.Size(91, 20);
            this.cb_attack.TabIndex = 15;
            // 
            // cb_defence
            // 
            this.cb_defence.FormattingEnabled = true;
            this.cb_defence.Location = new System.Drawing.Point(312, 224);
            this.cb_defence.Name = "cb_defence";
            this.cb_defence.Size = new System.Drawing.Size(91, 20);
            this.cb_defence.TabIndex = 16;
            // 
            // cb_Pass
            // 
            this.cb_Pass.FormattingEnabled = true;
            this.cb_Pass.Location = new System.Drawing.Point(458, 222);
            this.cb_Pass.Name = "cb_Pass";
            this.cb_Pass.Size = new System.Drawing.Size(91, 20);
            this.cb_Pass.TabIndex = 17;
            // 
            // cb_Shoot
            // 
            this.cb_Shoot.FormattingEnabled = true;
            this.cb_Shoot.Location = new System.Drawing.Point(578, 222);
            this.cb_Shoot.Name = "cb_Shoot";
            this.cb_Shoot.Size = new System.Drawing.Size(91, 20);
            this.cb_Shoot.TabIndex = 18;
            // 
            // MainForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.panel2);
            this.Controls.Add(this.panel1);
            this.Name = "MainForm";
            this.Text = "진호대 퀴즈";
            this.panel1.ResumeLayout(false);
            this.panel1.PerformLayout();
            this.panel2.ResumeLayout(false);
            ((System.ComponentModel.ISupportInitialize)(this.dataView)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Panel panel1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.TextBox tb_result;
        private System.Windows.Forms.TextBox tb_problem;
        private System.Windows.Forms.TextBox tb_foods;
        private System.Windows.Forms.Button btn_view;
        private System.Windows.Forms.Button btn_inputData;
        private System.Windows.Forms.Button btn_calc;
        private System.Windows.Forms.Button btn_food;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Panel panel2;
        private System.Windows.Forms.DataGridView dataView;
        private System.Windows.Forms.ComboBox cb_Shoot;
        private System.Windows.Forms.ComboBox cb_Pass;
        private System.Windows.Forms.ComboBox cb_defence;
        private System.Windows.Forms.ComboBox cb_attack;
        private System.Windows.Forms.Label label7;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.TextBox tb_name;
    }
}

