package com.tencentcloudapi.postgres.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeDBXlogsResponse  extends AbstractModel{


    /**
    * 表示此次返回结果有多少条数据。
    */
    @SerializedName("TotalCount")
    @Expose
    private Integer TotalCount;

    /**
    * Xlog列表
    */
    @SerializedName("XlogList")
    @Expose
    private Xlog [] XlogList;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取表示此次返回结果有多少条数据。
     * @return TotalCount 表示此次返回结果有多少条数据。
     */
    public Integer getTotalCount() {
        return this.TotalCount;
    }

    /**
     * 设置表示此次返回结果有多少条数据。
     * @param TotalCount 表示此次返回结果有多少条数据。
     */
    public void setTotalCount(Integer TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * 获取Xlog列表
     * @return XlogList Xlog列表
     */
    public Xlog [] getXlogList() {
        return this.XlogList;
    }

    /**
     * 设置Xlog列表
     * @param XlogList Xlog列表
     */
    public void setXlogList(Xlog [] XlogList) {
        this.XlogList = XlogList;
    }

    /**
     * 获取唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @return RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @param RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "XlogList.", this.XlogList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}
