package com.jun.autoBI.utils;

import org.apache.commons.lang3.StringUtils;

/**
 * SQL工具
 */
public class SqlUtils {

    /**
     * 校验排序字段是否合法（防止SQL注入）
     * @param sortField
     * @return
     */
    public static boolean validSortField(String sortField) {
        if(StringUtils.isBlank(sortField)) {
            return false;
        }
        return !StringUtils.containsAny(sortField, "=", "(",")", " ");
    }
}
