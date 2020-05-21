/**
 * Copyright 2014-2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.webank.webase.data.collect.block.entity;

import java.time.LocalDateTime;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * BlockTaskPool.
 *
 */
@Data
@Accessors(chain = true)
public class TbBlockTaskPool {
    private long id;
    private long blockNumber;
    private int syncStatus;
    private int certainty;
    private int handleItem = 0;
    private LocalDateTime createTime;
    private LocalDateTime modifyTime;
}
