/*
 * Copyright 2014 - 2017 Real Logic Ltd.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package io.aeron.archiver;

interface ArchiverProtocolListener
{
    void onArchiveStop(String channel, int streamId);

    void onArchiveStart(String channel1, int streamId);

    void onListStreamInstances(int from, int to, String replyChannel, int replyStreamId);

    void onReplayStop(int sessionId);

    void onReplayStart(
        int sessionId,
        int replyStreamId,
        String replyChannel,
        int streamInstanceId,
        int termId,
        int termOffset,
        long length);
}