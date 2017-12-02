package silseup4;

public class EmployeeDriver
{
   public static void main (String[] args)
   {
      RegEmployee employeeOne;  // RegEmployee 객체 참조변수
      TempEmployee employeeTwo;	// TempEmployee 객체 참조변수

      // 이름이 ‘둘리’이고 소속부서가 ‘마케팅’이고 연봉이 6,000이고
      // 보너스 지급률이 0.4인 정규직 직원을 나타내는 RegEmployee 객체를 생성한다
      employeeOne = new RegEmployee("둘리", "마케팅", 6000, 0.4);

      // 객체의 현재 상태를 출력한다
      System.out.print(employeeOne);

      // 정규직 직원의 월급을 계산한 후 출력한다
      
      System.out.println(", 월급액: " + employeeOne.pay());


      // 이름이 ‘또치’이고 소속부서가 ‘연구개발’이고 시간당 임금이 1인
      // 계약직 직원을 나타내는 TempEmployee 객체를 생성한다
      employeeTwo = new TempEmployee("또치", "연구개발", 1);

      // 계약직 직원의 근무시간에 300을 더한다
      employeeTwo.addHours(300);

      // 객체의 현재 상태를 출력한다
      System.out.print(employeeTwo);

      // 계약직 직원의 월급을 계산한 후 출력한다
      System.out.println(", 월급액: " + employeeTwo.pay());
      
      
      employeeTwo.addHours(555);//0으로 초기화되엇는지 확인 ok
      System.out.println(", 월급액: " + employeeTwo.pay());
   }
}