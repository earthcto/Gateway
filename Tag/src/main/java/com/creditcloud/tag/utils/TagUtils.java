/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.tag.utils;

import com.creditcloud.model.enums.Realm;
import com.creditcloud.tag.constants.TagConstant;
import com.creditcloud.tag.model.Tag;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

/**
 * 与Tag相关的简单方法
 *
 * @author sobranie
 */
public class TagUtils {

    /**
     * 将前台显示用的tagString转换为tag类对象.
     *
     * 形如“BRANCH:DFEF5840-78F2-4758-88C2-B670F83A44A1”，“INTERNAL_USER”
     * 需要判断解析字符串中是否有可解析的REALM，没有则当做STRING整体处理
     *
     * @param tagString
     * @return
     */
    public static Tag toTag(String tagString) {
        if (StringUtils.isBlank(tagString)) {
            return null;
        }
        String trimmedTagString = tagString.trim();
        int index = trimmedTagString.indexOf(TagConstant.SEPERATOR);
        if (index <= 0) {
            return new Tag(Realm.STRING, trimmedTagString, null);
        } else {
            try {
                Realm realm = Realm.valueOf(trimmedTagString.substring(0, index));
                return new Tag(realm, trimmedTagString.substring(index + 1), null);
            } catch (IllegalArgumentException ex) {
                return new Tag(Realm.STRING, trimmedTagString, null);
            }
        }
    }

    /**
     * 将seperator分隔的大字符串解析成Tag数组
     *
     * @param tagsString
     * @param seperator
     * @return
     */
    public static Tag[] parseTags(String tagsString, String seperator) {
        if (StringUtils.isBlank(tagsString)
            || StringUtils.isBlank(seperator)
            || !StringUtils.contains(tagsString, seperator)) {
            return TagConstant.EMPTY_ARRAY;
        }
        String[] tagStrings = tagsString.split(seperator);
        List<Tag> tags = new ArrayList<>();
        for (String tagString : tagStrings) {
            Tag tag = toTag(tagString);
            if (tag != null) {
                tags.add(tag);
            }
        }
        return tags.toArray(new Tag[tags.size()]);
    }
}
