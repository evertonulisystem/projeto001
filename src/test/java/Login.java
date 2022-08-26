import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;


public class Login {
        private WebDriver driver;

        @Before
        public void setUp() {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().setSize(new Dimension(1920, 1080));
            driver.manage().window().maximize();
            //driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);

        }
        @After
        public void tearDown() {

            //driver.quit();
        }
        @Test
        public void loginConexao() {
            driver.get("https://conexaoqa.herokuapp.com/");
            //assertThat(driver.findElement(By.cssSelector("*[data-test=\"navbar-conexaoQA\"]")).getText(), is("ConexãoQA"));
            //assertThat(driver.findElement(By.cssSelector("*[data-test=\"landing-login\"]")).getText(), is("Login"));
            driver.findElement(By.cssSelector("*[data-test=\"landing-login\"]")).click();
            driver.findElement(By.name("email")).click();
            driver.findElement(By.name("email")).sendKeys("creocatia3d@gmail.com");
            driver.findElement(By.name("password")).click();
            driver.findElement(By.name("password")).sendKeys("Imb!@#123");
            driver.findElement(By.cssSelector("*[data-test=\"login-submit\"]")).click();
            driver.findElement(By.cssSelector(".large")).click();
           // driver.findElement(By.cssSelector("li:nth-child(5) .hide-sm")).click();
           // assertThat(driver.findElement(By.cssSelector("*[data-test=\"dashboard-createProfile\"]")).getText(), is("Criar Perfil"));
           // assertThat(driver.findElement(By.cssSelector("li:nth-child(5) .hide-sm")).getText(), is("Sair"));
          //  driver.findElement(By.cssSelector("li:nth-child(5) .hide-sm")).click();
        }
    }

