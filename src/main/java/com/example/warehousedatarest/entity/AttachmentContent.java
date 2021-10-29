package com.example.warehousedatarest.entity;

import com.example.warehousedatarest.entity.template.AbsEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import com.example.warehousedatarest.entity.template.AbsEntity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class AttachmentContent extends AbsEntity {

    @OneToOne
    private Attachment attachment;

    private byte[] content;
}
