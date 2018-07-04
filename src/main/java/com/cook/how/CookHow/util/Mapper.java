package com.cook.how.CookHow.util;

import java.util.List;
import java.util.Optional;

public interface Mapper {

    <FROM, TO> List<TO> mapList(List<FROM> fromList, final Class<TO> toClass);

    <FROM, TO> TO map(FROM from, final Class<TO> toClass);

    <FROM, TO> TO map(Optional<FROM> from, Class<TO> toClass);
}
