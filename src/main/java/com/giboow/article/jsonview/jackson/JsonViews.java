package com.giboow.article.jsonview.jackson;

/**
 * Json view filter
 */
public class JsonViews {
    public interface Create {}
    public interface Update extends Create{}
    public interface Summary extends Update{}
    public interface Admin extends Summary{}
}
