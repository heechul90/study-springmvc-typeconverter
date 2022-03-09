package study.springmvc.typeconverter;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import study.springmvc.typeconverter.converter.IntegerToStringConverter;
import study.springmvc.typeconverter.converter.IpPortToStringConverter;
import study.springmvc.typeconverter.converter.StringToIntegerConverter;
import study.springmvc.typeconverter.converter.StringToIpPortConverter;
import study.springmvc.typeconverter.formatter.MyNumberFormatter;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addFormatters(FormatterRegistry registry) {
        //주석처리 우선순위
//        registry.addConverter(new StringToIntegerConverter());
//        registry.addConverter(new IntegerToStringConverter());
        registry.addConverter(new StringToIpPortConverter());
        registry.addConverter(new IpPortToStringConverter());

        //추가
        registry.addFormatter(new MyNumberFormatter());
    }
}
