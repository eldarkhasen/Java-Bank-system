using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LAB13
{
    class Ward {
        public int id;
        public string name;
        public Ward() {
        }
        public Ward(int id,string name) {
            this.id = id;
            this.name = name;
        }

        public void getWard() {
            string s = "ID:" + id + " Name:" + name;
            Console.WriteLine(s);
        }
        public  List<Doctor> doctors = new List<Doctor>();
        private List<Room> rooms = new List<Room>();
        public void addRoom() {
            
            rooms.Add(new LAB13.Room(rooms.Count+1,name));
        }
        public void getRoom() {

            Console.WriteLine("Number of rooms in the hospital: " + rooms.Count);


        }

    }

    class Room {
        public int roomID;
        public string wardName;
        public Room(int id,string wardName)
        {
            this.roomID = id;
            this.wardName = wardName;
        }
        public Room() {

        }
        
        
    }

    class Doctor {
        public int id;
        public string Name;
        public string Surname;
        public int WardId;

        public Doctor(int id,string name,string surname,int wardid) {
            this.id = id;
            this.Name = name;
            this.Surname = surname;
            this.WardId = wardid;
        }

        public void getDoctor() {
            string s = "ID: " + id + " Name: " + Name+" Surname: "+Surname +" Ward ID: "+WardId;
            Console.WriteLine(s);
        }
    }


       class Program
    {
        public static Ward w = new Ward();
        public static List<Ward> wards = new List<Ward>();
        public static void addWard(string name) {
            Ward w = new LAB13.Ward(wards.Count + 1, name);
            wards.Add(w);
        }
        public static void addDoctor(string name,string surname,int wardid) {
            Doctor d = new Doctor(w.doctors.Count+1,name,surname,wardid);
            w.doctors.Add(d);
        }
        
        static void Main(string[] args)
        {
            
            Console.WriteLine("Insert Number of wards");
            int num = Convert.ToInt32(Console.ReadLine());
            int room;
            string name = "";
            for (int i=1;i<=num;i++) {
                
                Console.WriteLine("Insert Name of "+i+" Ward");
                name = Console.ReadLine();
                Console.WriteLine("Insert Number of Rooms of "+i+" Ward");
                room = Convert.ToInt32(Console.ReadLine());
                w.addRoom();
                addWard(name);
            }

              foreach (Ward w in wards)
                w.getWard();
            Console.WriteLine("Insert Number of Doctors");
            num = Convert.ToInt32(Console.ReadLine());
            string DocName = "";
            string DocSurname = "";
            int wardId = 0;
            for (int i =1;i<=num;i++) {
                Console.WriteLine("Insert Name of " + i + " Doctor");
                DocName = Console.ReadLine();
                Console.WriteLine("Insert Surname of " + i + " Doctor");
                DocSurname = Console.ReadLine();
                Console.WriteLine("Insert  Ward ID of" + i + " Doctor ");
                wardId = Convert.ToInt32(Console.ReadLine());
                addDoctor(DocName, DocSurname, wardId);
            }

            w.getRoom();
            foreach (Doctor d in w.doctors)
                d.getDoctor();

            Console.ReadKey();
        }
    }
}
