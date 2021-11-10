
namespace FoodSelector
{
    partial class FoodSelector
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
            this.menulist = new System.Windows.Forms.TextBox();
            this.btn_Init = new System.Windows.Forms.Button();
            this.btn_Choice = new System.Windows.Forms.Button();
            this.result = new System.Windows.Forms.TextBox();
            this.SuspendLayout();
            // 
            // menulist
            // 
            this.menulist.Anchor = ((System.Windows.Forms.AnchorStyles)((((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Bottom) 
            | System.Windows.Forms.AnchorStyles.Left) 
            | System.Windows.Forms.AnchorStyles.Right)));
            this.menulist.Font = new System.Drawing.Font("경기천년제목 Light", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.menulist.Location = new System.Drawing.Point(36, 29);
            this.menulist.Multiline = true;
            this.menulist.Name = "menulist";
            this.menulist.Size = new System.Drawing.Size(713, 172);
            this.menulist.TabIndex = 0;
            this.menulist.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // btn_Init
            // 
            this.btn_Init.Font = new System.Drawing.Font("경기천년제목V Bold", 9F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.btn_Init.Location = new System.Drawing.Point(585, 228);
            this.btn_Init.Name = "btn_Init";
            this.btn_Init.Size = new System.Drawing.Size(164, 23);
            this.btn_Init.TabIndex = 1;
            this.btn_Init.Text = "초기화";
            this.btn_Init.UseVisualStyleBackColor = true;
            this.btn_Init.Click += new System.EventHandler(this.btn_Init_Click);
            // 
            // btn_Choice
            // 
            this.btn_Choice.Font = new System.Drawing.Font("경기천년제목V Bold", 9F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.btn_Choice.Location = new System.Drawing.Point(36, 228);
            this.btn_Choice.Name = "btn_Choice";
            this.btn_Choice.Size = new System.Drawing.Size(164, 23);
            this.btn_Choice.TabIndex = 2;
            this.btn_Choice.Text = "선택";
            this.btn_Choice.UseVisualStyleBackColor = true;
            this.btn_Choice.Click += new System.EventHandler(this.btn_Choice_Click);
            // 
            // result
            // 
            this.result.Font = new System.Drawing.Font("경기천년제목V Bold", 15.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.result.Location = new System.Drawing.Point(253, 313);
            this.result.Name = "result";
            this.result.ReadOnly = true;
            this.result.Size = new System.Drawing.Size(263, 28);
            this.result.TabIndex = 3;
            this.result.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // FoodSelector
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.result);
            this.Controls.Add(this.btn_Choice);
            this.Controls.Add(this.btn_Init);
            this.Controls.Add(this.menulist);
            this.Name = "FoodSelector";
            this.Text = "Food Selector";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.TextBox menulist;
        private System.Windows.Forms.Button btn_Init;
        private System.Windows.Forms.Button btn_Choice;
        private System.Windows.Forms.TextBox result;
    }
}

