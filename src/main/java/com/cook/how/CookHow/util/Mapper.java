package com.cook.how.CookHow.util;

import java.util.List;

public interface Mapper {

    public <FROM, TO> List<TO> mapList(List<FROM> fromList, final Class<TO> toClass);
}
