package com.example.sorl.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.SolrDocument;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SolrDocument(collection = "vtvtravel")
public class VtvTravelSearch {
    @Id
    @Field
    private String id;
    @Field
    private Integer comment_count;
    @Field
    private String content_name;
    @Field
    private Integer open_hour_7_end_1;
    @Field
    private String[] stags;
    @Field
    private String data_loc;
    @Field
    private Integer open_hour_1_start_1;
    @Field
    private String[] smodified;
    @Field
    private String logo;
    @Field
    private Integer open_hour_3_end_1;
    @Field
    private Integer like_count;
    @Field
    private Integer open_hour_3_start_1;
    @Field
    private String[] screated;
    @Field
    private String[] region_id;
    @Field
    private Integer weight;
    @Field
    private Integer open_hour_6_end_1;
    @Field
    private Integer open_hour_5_start_1;
    @Field
    private String is_trend;
    @Field
    private Integer open_hour_7_start_1;
    @Field
    private String name;
    @Field
    private String[] publish_date;
    @Field
    private Integer status;
    @Field
    private String category_tree_code;
    @Field
    private Integer open_hour_2_end_1;
    @Field
    private String short_description;
    @Field
    private Integer open_hour_from;
    @Field
    private String oid;
    @Field
    private Integer open_hour_5_end_1;
    @Field
    private String url_alias;
    @Field
    private String lang_code;
    @Field
    private String content_type;
    @Field
    private String category_tree_name;
    @Field
    private Integer count_rate;
    @Field
    private Integer open_hour_2_start_1;
    @Field
    private String address;
    @Field
    private Integer open_hour_4_start_1;
    @Field
    private Integer open_hour_6_start_1;
    @Field
    private Integer open_hour_1_end_1;
    @Field
    private Integer open_hour_4_end_1;
    @Field
    private Integer view_count;
    @Field
    private Integer post_rate;
    @Field
    private String code_name;
    @Field
    private String region_name;
    @Field
    private Float _version_;
}
