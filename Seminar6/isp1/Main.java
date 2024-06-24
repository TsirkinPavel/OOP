package isp1;
/*- Принцип разделения интерфейса
    
    Клиенты не должны реализовывать интерфейсы,
    которые они не используют.
    Данный принцип требует разделения «толстых»
    интерфейсов на несколько специализированных,
    связанных общей функциональностью. 
    
    Здесь мы выделили отдельный интерфейс PhonePayable чтобы удалить вывод ошибки,
    Так как Терминал не может принимать эту оплату
    */


import isp1.pay.impl.InternetPaymentService;
import isp1.pay.impl.TerminalPaymentService;

public class Main {
    public static void main(String[] args) {
        InternetPaymentService internetService = new InternetPaymentService();
        internetService.payWebMoney(10);
        internetService.payWebMoney(10);
        internetService.payWebMoney(10);

        TerminalPaymentService terminalService = new TerminalPaymentService();
        terminalService.payWebMoney(10);
        terminalService.payCreditCard(10);
    }
}
