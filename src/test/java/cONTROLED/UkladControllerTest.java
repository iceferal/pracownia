package cONTROLED;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.jooq.DSLContext;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class UkladControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void GetMappingUklad() throws Exception{
    mvc.perform(MockMvcRequestBuilders.get("/uklad"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.content().contentType("application/json;charset=UTF-8"))
            .andDo(print());
    }

  /*  @Test
    public void deleteuklad() throws Exception {
        mvc.perform(MockMvcRequestBuilders.delete("/uklad/{nazwa}", "38")
                .contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(print());
    }
*/
}
