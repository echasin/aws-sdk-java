/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cloudwatch.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.cloudwatch.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Delete Alarms Request Marshaller
 */
public class DeleteAlarmsRequestMarshaller implements Marshaller<Request<DeleteAlarmsRequest>, DeleteAlarmsRequest> {

    public Request<DeleteAlarmsRequest> marshall(DeleteAlarmsRequest deleteAlarmsRequest) {
        Request<DeleteAlarmsRequest> request = new DefaultRequest<DeleteAlarmsRequest>(deleteAlarmsRequest, "AmazonCloudWatch");
        request.addParameter("Action", "DeleteAlarms");
        request.addParameter("Version", "2010-08-01");
        if (deleteAlarmsRequest != null) {
            java.util.List<String> alarmNamesList = deleteAlarmsRequest.getAlarmNames();
            int alarmNamesListIndex = 1;
            for (String alarmNamesListValue : alarmNamesList) {
                if (alarmNamesListValue != null) {
                    request.addParameter("AlarmNames.member." + alarmNamesListIndex, StringUtils.fromString(alarmNamesListValue));
                }
                alarmNamesListIndex++;
            }
        }


        return request;
    }
}
