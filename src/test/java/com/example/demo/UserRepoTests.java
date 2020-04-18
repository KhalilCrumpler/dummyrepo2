package com.example.demo;

import com.example.demo.Entity.User;
import com.example.demo.Repository.AccountRepo;
import com.example.demo.Repository.UserRepo;
import com.example.demo.Service.UserService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest


public class UserRepoTests {
    @Mock
    private UserRepo userMock;
    @InjectMocks
    private UserService service;
    @Before
    public void setUp() throws Exception {

        MockitoAnnotations.initMocks(this);
    }
    @Test
    public void userNameTest(){
       User user = new User("khalil", "abc");
       Assert.assertEquals("khalil", user.getName());
    }

}
