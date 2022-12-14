@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT, properties = {
    "spring.datasource.url=jdbc:tc:postgresql:14-alpine://testcontainers/postgres",
    "spring.datasource.username=postgres",
    "spring.datasource.password=password"
})
class SpringbootApplicationTests {

        @Test
        void contextLoads() {
        }

}