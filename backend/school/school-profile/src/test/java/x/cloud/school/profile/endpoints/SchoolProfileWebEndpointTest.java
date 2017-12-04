package x.cloud.school.profile.endpoints;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import x.cloud.school.profile.CloudSchoolProfileServiceApplication;

import static org.junit.jupiter.api.Assertions.*;


@DisplayName("Cloud School Profile Service Application")
@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = CloudSchoolProfileServiceApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SchoolProfileWebEndpointTest {

    @Test
    void name() {

    }
}