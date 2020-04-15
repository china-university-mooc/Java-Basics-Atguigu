/**
 * 家庭记账软件
 */
public class FamilyAccount {

	public static void main(String[] args) {
		boolean quit = false;
		String details = "收支\t账户金额\t收支金额\t说明\n";
		int balance = 10000;
		while(!quit) {
			System.out.println("-----------------家庭收支记账软件-----------------\n");
			System.out.println("                   1 收支明细");
			System.out.println("                   2 登记收入");
			System.out.println("                   3 登记支出");
			System.out.println("                   4 退   出\n");
			System.out.print("                   请选择(1-4):");

			char selection = Utility.readMenuSelection();
			switch (selection) {
				case '1':
					System.out.println("-----------------当前收支明细记录-----------------");
					System.out.println(details);
					System.out.println("\n--------------------------------------------------\n");
					break;
				case '2':
					System.out.print("本次收入金额:");
					int income = Utility.readNumber();
					System.out.print("本次收入说明:");
					String incomeInfo = Utility.readString();

					balance += income;
					details += "收入\t" + balance + "\t\t" + income + "\t\t" + incomeInfo + "\n";
					System.out.println("---------------------登记完成---------------------\n");
					break;
				case '3':
					System.out.print("本次支出金额:");
					int pay = Utility.readNumber();
					System.out.print("本次支出说明:");
					String paynfo = Utility.readString();

					balance -= pay;
					details += "收入\t" + balance + "\t\t" + pay + "\t\t" + paynfo + "\n";
					System.out.println("---------------------登记完成---------------------\n");
					break;
				case '4':
					System.out.print("确认是否退出(Y/N):");
					char confirm = Utility.readConfirmSelection();
					if (confirm == 'Y') {
						quit = true;
					}
			}
		}
	}
}