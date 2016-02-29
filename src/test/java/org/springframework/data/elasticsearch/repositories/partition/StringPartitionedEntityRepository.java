/*
 * Copyright 2014 the original author or authors.
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
package org.springframework.data.elasticsearch.repositories.partition;

import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.partition.keys.Partition;
import org.springframework.data.elasticsearch.entities.partition.DatePartitionedEntity;
import org.springframework.data.elasticsearch.entities.partition.StringPartitionedEntity;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 *
 * @author Franck Lefebure
 *
 */
public interface StringPartitionedEntityRepository extends ElasticsearchRepository<StringPartitionedEntity, String> {
    public List<StringPartitionedEntity> findByCustomerId(String customerId, Partition partition, Pageable pageable);
}
