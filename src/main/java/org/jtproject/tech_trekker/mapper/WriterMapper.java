package org.jtproject.tech_trekker.mapper;

import org.jtproject.tech_trekker.dto.WriterRequest;
import org.jtproject.tech_trekker.model.WriterInfo;
import org.springframework.beans.BeanUtils;

public class WriterMapper {
    public static WriterInfo convertReqeust(WriterRequest request) {
        var writerInfo = new WriterInfo();
        BeanUtils.copyProperties(request, writerInfo);
        return writerInfo;
    }
}
