class Company{
    void getTotalEmployee(){
        System.out.println("The total employees are 1000");
    }
        }

        class CountryBranch extends Company{
    void totalEmpInCountry (){
                System.out.println("The total employees are 500");
    }
        }

class LocalBranch extends CountryBranch{
    void totalLocalEmployee (){
        System.out.println("The total employees are 100");
    }
}


public class MultiLevelInheritanceExample {
    public static void main(String[] args) {
LocalBranch lb = new LocalBranch();
//lb.totalLocalEmployee();
//lb.totalEmpInCountry();
//lb.getTotalEmployee();

CountryBranch cb = new CountryBranch();
cb.totalEmpInCountry();
cb.getTotalEmployee();
    }
}
