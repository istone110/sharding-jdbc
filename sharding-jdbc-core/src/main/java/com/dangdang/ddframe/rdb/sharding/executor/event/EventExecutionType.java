/*
 * Copyright 1999-2015 dangdang.com.
 * <p>
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
 * </p>
 */

package com.dangdang.ddframe.rdb.sharding.executor.event;

/**
 * 事件触发类型.
 * 
 * @author zhangliang
 */
public enum EventExecutionType {
    
    /**
     * 执行前.
     */
    BEFORE_EXECUTE, 
    
    /**
     * 执行成功.
     */
    EXECUTE_SUCCESS, 
    
    /**
     * 执行失败.
     */
    EXECUTE_FAILURE
}
