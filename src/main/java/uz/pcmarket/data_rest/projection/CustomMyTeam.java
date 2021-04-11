package uz.pcmarket.data_rest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pcmarket.data_rest.entity.*;

@Projection(types = MyTeam.class)
public interface CustomMyTeam {

    Integer getId();

    String getName();

    String getOccupation();

    Attachment getAttachment();
}
