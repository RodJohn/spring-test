

# 概述


# BaseTest

    @RunWith(SpringJUnit4ClassRunner.class)
    @SpringBootTest(classes = MainApplication.class)
    public class BaseTest {
    
        @Test
        public void hello(){
            System.out.println("test-ok");
        }
    
    }


# transacation

    默认情况下，测试用例结束后，事务自动回滚
    
    全局修改
    @Transactional
    @TransactionConfiguration(defaultRollback = false)
    
    方法级别修改
     @Test
     @Rollback(false)
     public void test_doSomething_failed_because_not_meet_some_condition(){...}
