/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SnapshotByTimeOffsetTask2017  extends AbstractModel{

    /**
    * 截图任务 ID。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 截图文件 ID。
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 截图规格，参见[指定时间点截图参数模板](https://cloud.tencent.com/document/product/266/11702#.E6.8C.87.E5.AE.9A.E6.97.B6.E9.97.B4.E7.82.B9.E6.88.AA.E5.9B.BE.E6.A8.A1.E6.9D.BF)。
    */
    @SerializedName("Definition")
    @Expose
    private Integer Definition;

    /**
    * 截图结果信息。
    */
    @SerializedName("SnapshotInfoSet")
    @Expose
    private SnapshotByTimeOffset2017 [] SnapshotInfoSet;

    /**
     * 获取截图任务 ID。
     * @return TaskId 截图任务 ID。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * 设置截图任务 ID。
     * @param TaskId 截图任务 ID。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * 获取截图文件 ID。
     * @return FileId 截图文件 ID。
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * 设置截图文件 ID。
     * @param FileId 截图文件 ID。
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * 获取截图规格，参见[指定时间点截图参数模板](https://cloud.tencent.com/document/product/266/11702#.E6.8C.87.E5.AE.9A.E6.97.B6.E9.97.B4.E7.82.B9.E6.88.AA.E5.9B.BE.E6.A8.A1.E6.9D.BF)。
     * @return Definition 截图规格，参见[指定时间点截图参数模板](https://cloud.tencent.com/document/product/266/11702#.E6.8C.87.E5.AE.9A.E6.97.B6.E9.97.B4.E7.82.B9.E6.88.AA.E5.9B.BE.E6.A8.A1.E6.9D.BF)。
     */
    public Integer getDefinition() {
        return this.Definition;
    }

    /**
     * 设置截图规格，参见[指定时间点截图参数模板](https://cloud.tencent.com/document/product/266/11702#.E6.8C.87.E5.AE.9A.E6.97.B6.E9.97.B4.E7.82.B9.E6.88.AA.E5.9B.BE.E6.A8.A1.E6.9D.BF)。
     * @param Definition 截图规格，参见[指定时间点截图参数模板](https://cloud.tencent.com/document/product/266/11702#.E6.8C.87.E5.AE.9A.E6.97.B6.E9.97.B4.E7.82.B9.E6.88.AA.E5.9B.BE.E6.A8.A1.E6.9D.BF)。
     */
    public void setDefinition(Integer Definition) {
        this.Definition = Definition;
    }

    /**
     * 获取截图结果信息。
     * @return SnapshotInfoSet 截图结果信息。
     */
    public SnapshotByTimeOffset2017 [] getSnapshotInfoSet() {
        return this.SnapshotInfoSet;
    }

    /**
     * 设置截图结果信息。
     * @param SnapshotInfoSet 截图结果信息。
     */
    public void setSnapshotInfoSet(SnapshotByTimeOffset2017 [] SnapshotInfoSet) {
        this.SnapshotInfoSet = SnapshotInfoSet;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamArrayObj(map, prefix + "SnapshotInfoSet.", this.SnapshotInfoSet);

    }
}

