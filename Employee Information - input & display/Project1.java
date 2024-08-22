public class Project1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length==1) {
			Project1 p=new Project1();
			int x=Integer.parseInt(args[0]);
			int i=p.get_emp(x);
			if(i==-1) {
				System.out.println("There is no employee with empid:"+args[0]);
			}
			else {
				System.out.println("Emp No. Emp Name  Department     Designation   Salary");
				System.out.print(args[0]+"    ");
				String name=p.get_name(i);
				String dept=p.get_dept(i);
				String des=p.get_des(i);
				int sal=p.get_sal(i);
				System.out.print(name);
				for(int j=name.length();j<10;j++) {
					System.out.print(" ");
				}
				System.out.print(dept);
				for(int j=dept.length();j<15;j++) {
					System.out.print(" ");
				}
				System.out.print(des);
				for(int j=des.length();j<14;j++) {
					System.out.print(" ");
				}
				System.out.print(sal);
			}
			
		}

	}
	int eid[] = { 1001, 1002, 1003, 1004, 1005, 1006, 1007 };
    String ename[] = { "Ashish", "Sushma", "Rahul", "Chahat", "Ranjan", "Suman", "Tanmay" };
    String ejd[] = { "01/04/2009", "23/08/2012", "12/11/2008", "29/01/2013", "16/07/2005", "1/1/2000",
            "12/06/2006" };
    char dc[] = { 'e', 'c', 'k', 'r', 'm', 'e', 'c' };
    String dept[] = { "R&D", "PM", "Acct", "Front Desk", "Engg", "Manufacturing", "PM" };
    int basic[] = { 20000, 30000, 10000, 12000, 50000, 23000, 29000 };
    int hra[] = { 8000, 12000, 8000, 6000, 20000, 9000, 12000 };
    int it[] = { 3000, 9000, 1000, 2000, 20000, 4400, 10000 };
    public int get_emp(int id) {
    	for(int i=0;i<7;i++) {
    		if(id==eid[i]) {
    			return i;
    		}
    	}
    	return -1;
    }
    public String get_name(int id) {
    	return ename[id];
    }
    public String get_dept(int id) {
    	return dept[id];
    }
    public String get_des(int id) {
    	char c=dc[id];
    	String s="";
    	switch(c) {
    	case 'e': s="Engineer";
    	break;
        case 'c': s="Consultant";
        break;
        case 'k': s="Clerk";
        break;
        case 'r': s="Receptionist";
        break;
        case 'm': s="Manager";
        break;
    	}
    	return s;
    }
    public int get_sal(int id) {
    	char c=dc[id];
    	int s=0;
    	switch(c) {
    	case 'e': s=20000;
    	break;
        case 'c': s=32000;
        break;
        case 'k': s=12000;
        break;
        case 'r': s=15000;
        break;
        case 'm': s=40000;
        break;
    	}
    	s=s+basic[id]+hra[id]-it[id];
    	return s;
    }

}
