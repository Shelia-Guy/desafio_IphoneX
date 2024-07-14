public class IphoneUml {

    interface ReprodutorMusical {
        void tocar();
        void pausar();
        void proximaMusica();
        void musicaAnterior();
    }

    // Classe abstrata PhoneDevice
    abstract class PhoneDevice {
        private String phoneNumber;

        public PhoneDevice(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public abstract void ligar(String numero);
        public abstract void atender();
        public abstract void encerrar();
    }

    // Classe WebBrowser
    public class WebBrowser {
        private String currentURL;
    
        public WebBrowser(String initialURL) {
            this.currentURL = initialURL;
        }
    
        public void exibirPagina(String url) {
            System.out.println("Navegando para: " + url);
            this.currentURL = url;
        }
    
        public void voltarPagina () {
            System.out.println("Voltando para a página anterior");
        }
    
        public void atualizarPagina() {
            System.out.println("Atualizando a página");
        }
    }
    

    public static void main(String[] args) {
        // Exemplo de uso
        IphoneUml iphone = new IphoneUml();
        iphone.tocar();
        iphone.pausar();
        iphone.proximaMusica();
        iphone.musicaAnterior();
    }

    public void tocar() {
        System.out.println("Reproduzindo música");
    }

    public void pausar() {
        System.out.println("Pausando a reprodução");
    }

    public void proximaMusica() {
        System.out.println("Avançando para a próxima faixa");
    }

    public void musicaAnterior() {
        System.out.println("Voltando para a faixa anterior");
    }

    {
        
        // Criando uma instância da classe WebBrowser
        WebBrowser browser = new WebBrowser("https://www.bing.com");
        browser.exibirPagina("https://www.bing.com");
        browser.voltarPagina();
        browser.atualizarPagina();
    }



    //class AparelhoTelefonica
    public static void PhoneDevice(String[] args) {
        // Exemplo de uso
        IphoneUml iphone = new IphoneUml();
        iphone.ligar("123456789");
        iphone.atender();
        iphone.encerrar();
        
    }

    public void ligar(String numero) {
        System.out.println("Chamando " + numero);
    }

    public void atender() {
        System.out.println("Atendendo chamada");
    }

    public void encerrar() {
        System.out.println("Encerrando chamada");
    }
}
