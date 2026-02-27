import java.util.Scanner;
/*1.Calculate total, percentage, and grade of 5 subjects.
public class task5{
	public static void main(String[] args){
		int Marathi=84;
		int Hindi=85;
		int English =80;
		int Math=97;
		int Science=90;
		
		int Tmarks=Marathi+Hindi+English+Math+Science;
		double Percentage=Tmarks/5;
		
		System.out.println("Total Marks in Exam:- "+Tmarks);
		System.out.println("Percentage :-"+Percentage +"%");
	
		if(Tmarks<= 450){
			System.out.println("Grade A+");
		}else if(Tmarks <=400){
			System.out.println("Grade A");
		}else if(Tmarks <=350){
			System.out.println("Grade B");
		}else if(Tmarks <=300){
			System.out.println("Grade C");
		}else{
			System.out.println("Grade D");
		}
	}
}


2.Calculate electricity bill based on units.
public class task5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter unit- ");
        int num_of_units= sc.nextInt();
		
		double bill=0;
		if(num_of_units <=100){
			bill = num_of_units*10;
		}else if(num_of_units <=200){
			bill = num_of_units*15;
		}else if(num_of_units <=300){
			bill = num_of_units*20;
		}else{
			bill=num_of_units*30;
		}
		
		System.out.println("Electricity Bill: " + bill);
		
	}
}


3.Calculate telephone bill based on calls.
public class task5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total calls");
		int calls=sc.nextInt();
		
		double bill=0;
		if(calls <= 10){
			bill = calls*5;
		}else if (calls <=20){
			bill = calls*10;
		}else if(calls <=30){
			bill = calls*15;
		}else if(calls <=40){
			bill =calls*20;
		}else{
			bill = calls*50;
		}
		System.out.println("Telephone Bill: " + bill);
	}
}


4.Calculate water bill based on consumption.
public class task5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total consumption of water : ");
		int water=sc.nextInt();
		
		double bill=0;
		if(water <= 250){
			bill = water*5;
		}else if (water <=500){
			bill = water*10;
		}else if(water <=1000){
			bill = water*15;
		}else if(water <=1500){
			bill =water*20;
		}else{
			bill = water*50;
		}
		System.out.println("Water BILL: " + bill);
	}
}



5.Calculate bonus based on salary.
public class task5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter salary :");
			double salary=sc.nextDouble();
			
			double bonus;
			
			if(salary >=100000){
				bonus = salary*0.20;
			}else if(salary >= 50000){
				bonus = salary*0.10;
			}else if(salary >=30000){
				bonus = salary*0.7;
			}else if(salary >= 25000){
				bonus = salary*0.5;
			}else{
				bonus= salary*0.3;
			}
			System.out.println("Bonus on the salary is : "+bonus);
			System.out.println("Total salary with bonus : "+(bonus+salary));
		}
}
*/

//6.Calculate tax based on income.
/*public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your income: ");
        double income = sc.nextDouble();

        double tax;

        if (income >= 1000000) {
            tax = income * 0.30;
        } else if (income >= 700000) {
            tax = income * 0.25;
        } else if (income >= 500000) {
            tax = income * 0.15;
        } else if (income >= 100000) {
            tax = income * 0.10;
        } else {
            tax = income * 0.05;
        }

        System.out.println("Tax on Income: " + tax);
        System.out.println("Income after Tax: " + (income - tax));
    }
}*/


//7.Calculate discount based on purchase amount.
/*public class task5{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter purchase amount: ");
        double amount = sc.nextDouble();

        double discount;
		
		if (amount >= 10000) {
            discount = amount * 0.20;
        } else if (amount >= 7000) {
            discount = amount * 0.15;
        } else if (amount >= 5000) {
            discount = amount * 0.10;
        } else if (amount >= 2000) {
            discount = amount * 0.05;
        } else {
            discount = 0;
        }

        System.out.println("Discount: " + discount);
		System.out.println("Total Amount :"+(amount-discount));
	}
}*/


//8.Calculate net salary after deductions.
/*public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter basic salary: ");
        double basic = sc.nextDouble();

        double hra = basic * 0.20;
        double da = basic * 0.10;
        double pf = basic * 0.12;
        double tax = basic * 0.10;

        double grossSalary = basic + hra + da;
        double totalDeductions = pf + tax;
        double netSalary = grossSalary - totalDeductions;

        System.out.println("Basic Salary: " + basic);
        System.out.println("HRA (20%): " + hra);
        System.out.println("DA (10%): " + da);
        System.out.println("PF (12%): " + pf);
        System.out.println("Tax (10%): " + tax);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Total Deductions: " + totalDeductions);
        System.out.println("Net Salary: " + netSalary);
    }
}

*/
//9.Calculate insurance premium.
/*public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.print("Enter insured amount: ");
        double amount = sc.nextDouble();

        double premium;

        if (age <= 25) {
            premium = amount * 0.05;
        } else if (age <= 40) {
            premium = amount * 0.08;
        } else if (age <= 60) {
            premium = amount * 0.12;
        } else {
            premium = amount * 0.18;
        }

        System.out.println("Insurance Premium: " + premium);
    }
}*/

//10.Calculate commission based on sales.
/*public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total sales: ");
        double sales = sc.nextDouble();
        double commission;

        if (sales >= 100000) {
            commission = sales * 0.20;
        } else if (sales >= 70000) {
            commission = sales * 0.15;
        } else if (sales >= 50000) {
            commission = sales * 0.10;
        } else if (sales >= 20000) {
            commission = sales * 0.05;
        } else {
            commission = sales * 0.02;
        }

        System.out.println("Commission: " + commission);
        System.out.println("Total Amount (Sales + Commission): " + (sales + commission));
    }
}*/

//11.Check eligibility for scholarship.
/*public class task5{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks percentage: ");
        double marks = sc.nextDouble();

        System.out.print("Enter family income: ");
        double income = sc.nextDouble();

        if (marks >= 80 & income <= 100000) {
            System.out.println("You are eligible for scholarship.");
        } else {
            System.out.println("You are not eligible for scholarship.");
        }
    }
}*/
//12.Calculate fine for library late return.
/*public class task5{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days late: ");
        int days = sc.nextInt();

        int fine;

        if (days <= 5) {
            fine = days * 2;
        } else if (days <= 10) {
            fine = days * 5;
        } else if (days <= 20) {
            fine = days * 10;
        } else {
            fine = days * 20;
        }

        System.out.println("Days Late: " + days);
        System.out.println("Library Fine: " + fine);
    }
}
*/
//13.Calculate overtime pay.
/*public class task5{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total working hours: ");
        int hours = sc.nextInt();

        int rate = 200; // overtime rate per hour
        int overtimePay;

        if (hours > 40) {
            int overtimeHours = hours - 40;
            overtimePay = overtimeHours * rate;
        } else {
            overtimePay = 0;
        }

        System.out.println("Total Hours Worked: " + hours);
        System.out.println("Overtime Pay: " + overtimePay);
    }
}
*/
//14.Calculate hotel room charges.
/*public class task5{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Room Types:");
        System.out.println("1. Single Room");
        System.out.println("2. Double Room");
        System.out.println("3. Deluxe Room");

        System.out.print("Enter room type (1/2/3): ");
        int type = sc.nextInt();

        System.out.print("Enter number of days: ");
        int days = sc.nextInt();

        int rate;
        int totalBill;

        if (type == 1) {
            rate = 1000;
        } else if (type == 2) {
            rate = 2000;
        } else if (type == 3) {
            rate = 3500;
        } else {
            System.out.println("Invalid room type!");
        }

        totalBill = rate * days;

        System.out.println("Room Type: " + type);
        System.out.println("Days Stayed: " + days);
        System.out.println("Total Hotel Charges: " + totalBill);
    }
}
*/
		
//15.Calculate mobile recharge plan amount.
/*public class task5{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Mobile Recharge Plans:");
        System.out.println("1. Basic Plan - ₹199");
        System.out.println("2. Standard Plan - ₹399");
        System.out.println("3. Premium Plan - ₹599");
        System.out.println("4. Unlimited Plan - ₹799");
        System.out.print("Select plan (1-4): ");
        int plan = sc.nextInt();
        int amount;
        if (plan == 1) {
            amount = 199;
        } else if (plan == 2) {
            amount = 399;
        } else if (plan == 3) {
            amount = 599;
        } else if (plan == 4) {
            amount = 799;
        } else {
            System.out.println("Invalid plan selected!");
            return;
        }
        System.out.println("Recharge Successful!");
        System.out.println("Amount to Pay: ₹" + amount);
    }
}*/
//16.Calculate movie ticket price with discount.
/*public class task5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int baseprice = 300;
		System.out.print("Age of a Person :");
		int age=sc.nextInt();
		
		double discount;
		double finalprice;
		
		System.out.println("Are you Student !");
		boolean student=sc.nextBoolean();
		
		if(age <=12 ){
			discount=0.50;
		}else if(student){
			discount=0.30;
		}else if(age >=60){
			discount =0.20;
		}else{
			discount=0;
		}
		finalprice = baseprice - (baseprice * discount);
		System.out.println("Discount Applied: " + (discount * 100) + "%");
        System.out.println("Final Ticket Price: " + finalprice);
	}
}*/
//17.Calculate bus ticket fare.
/*public class task5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a distance to be travelled");
		double distance=sc.nextDouble();
		
		double fare;
		
		if(distance >=50){
			fare=distance*2;
		}else if(distance >=100){
			fare=distance*4;
		}else if(distance >=200){
			fare=distance*10;
		}else if(distance >500){
			fare=distance*15;
		}else{
			fare=distance*20;
		}
		System.out.println("Distance travelled by person"+distance);
		System.out.println("Total Fare : "+fare+"Rs");
	}
}*/


//18.Calculate hostel fee with concession.
/*public class task5{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Hostel Fees :");
		double fees= sc.nextInt();		
		System.out.println("1.General");
		System.out.println("2.OBC");
		System.out.println("3.SC");
		System.out.println("4.ST");
		int option =sc.nextInt();
		System.out.println("Select category plan no (1-4) "+option);
		double concession=0;
		
		if(option == 1){
			concession=fees;
		}else if(option ==2){
			concession=fees*0.25;
		}else if(option == 3){
			concession=fees*0.50;
		}else if(option == 4){
			concession= fees*0.60;
		}else{
			System.out.println("Invalid input");
		}
		System.out.println("Concession will get :"+concession);
		System.out.println("fees With Concession"+(fees-concession));
	}
}
*/
//19.Calculate exam fee.
/*public class task5{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your secrion (A/B/C): ");
        char section = sc.next().charAt(0);

        int fee;

        switch (section) {
            case 'A':
                fee = 10000;
                break;
            case 'B':
                fee = 8000;
                break;
            case 'C':
                fee = 12000;
                break;
            default:
                fee = 0;
                System.out.println("Invalid section");
        }

        if (fee > 0) {
            System.out.println("Exam Fee for section " + section + " = " + fee);
        }
    }
}
*/
//20Calculate gym membership charges.
public class task5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Couple");
		System.out.println("2.Single");
		System.out.println("Select option 1.Couple or 2.Single");
		byte option = sc.nextByte();
		System.out.println("Enter number of month");
		byte month=sc.nextByte();
		int charges=0;
		int total_charges=0;
		
		if(option ==1 ){
		 charges =2499;
		}else if(option == 2){
			charges = 1499;
		}else{
			System.out.println("Invalid Option");
		}
		total_charges=charges*month;

		System.out.println("Month :- "+month);
		System.out.println("Total charges :-"+total_charges);
	}
}
