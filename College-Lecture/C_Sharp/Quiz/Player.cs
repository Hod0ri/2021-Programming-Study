using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Quiz
{
    class Player
    {
        public String name;
        public int attack;
        public int defence;
        public int pass;
        public int shoot;

        public Player(String name, int attack, int defence, int pass, int shoot)
        {
            this.name = name;
            this.attack = attack;
            this.defence = defence;
            this.pass = pass;
            this.shoot = shoot;
        }
        public Player()
        {

        }
    }
}
