package lam.study.sample;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
* <p>
* TODO
* </p>
* @author linanmiao
* @date 2018年9月8日
* @versio 1.0
*/
@Mapper
public interface CarMapper {
	
	CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);
	
	CarDto carToCarDto(Car car);

}
