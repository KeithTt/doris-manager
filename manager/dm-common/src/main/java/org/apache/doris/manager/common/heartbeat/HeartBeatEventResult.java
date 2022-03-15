// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

package org.apache.doris.manager.common.heartbeat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HeartBeatEventResult {
    private long eventId;

    private HeartBeatEventType eventType;

    private HeartBeatEventResourceType resourceType;

    private long agentNodeId;

    private long instanceId;

    private int eventStage;

    private HeartBeatEventResultType resultType;

    // Execution result of the event
    private Object resultInfo;

    private boolean isCompleted;

    public HeartBeatEventResult(HeartBeatEventInfo eventInfo) {
        this.eventId = eventInfo.getEventId();
        this.eventType = eventInfo.getEventType();
        this.agentNodeId = eventInfo.getAgentNodeId();
        this.resourceType = eventInfo.getResourceType();
        this.instanceId = eventInfo.getInstanceId();
    }
}
