package com.cook.how.CookHow.util;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
@Scope(value = "singleton")
public class DozerMapper implements Mapper{

    @Autowired
    private DozerBeanMapper dozerBeanMapper;

    @Override
    public <FROM, TO> List<TO> mapList(List<FROM> fromList, Class<TO> toClass) {
        return fromList
                .stream()
                .map(from -> this.dozerBeanMapper.map(from, toClass))
                .collect(Collectors.toList());
    }

    @Override
    public <FROM, TO> TO map(FROM from, Class<TO> toClass) {
        if (from == null) return null;
        return this.dozerBeanMapper.map(from, toClass);
    }

    @Override
    public <FROM, TO> TO map(Optional<FROM> from, Class<TO> toClass) {
        if (from.isPresent() ) return this.dozerBeanMapper.map(from.get(), toClass);
        return null;
    }

}
