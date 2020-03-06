/**
 * OpenAPI Petstore
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * The version of the OpenAPI document: 1.0.0
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 4.3.0-SNAPSHOT.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "Order.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {




Order::Order()
{
    m_Id = 0L;
    m_IdIsSet = false;
    m_PetId = 0L;
    m_PetIdIsSet = false;
    m_Quantity = 0;
    m_QuantityIsSet = false;
    m_ShipDate = utility::datetime();
    m_ShipDateIsSet = false;
    m_Status = utility::conversions::to_string_t("");
    m_StatusIsSet = false;
    m_Complete = false;
    m_CompleteIsSet = false;
}

Order::~Order()
{
}

void Order::validate()
{
    // TODO: implement validation
}

web::json::value Order::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_IdIsSet)
    {
        val[utility::conversions::to_string_t("id")] = ModelBase::toJson(m_Id);
    }
    if(m_PetIdIsSet)
    {
        val[utility::conversions::to_string_t("petId")] = ModelBase::toJson(m_PetId);
    }
    if(m_QuantityIsSet)
    {
        val[utility::conversions::to_string_t("quantity")] = ModelBase::toJson(m_Quantity);
    }
    if(m_ShipDateIsSet)
    {
        val[utility::conversions::to_string_t("shipDate")] = ModelBase::toJson(m_ShipDate);
    }
    if(m_StatusIsSet)
    {
        val[utility::conversions::to_string_t("status")] = ModelBase::toJson(m_Status);
    }
    if(m_CompleteIsSet)
    {
        val[utility::conversions::to_string_t("complete")] = ModelBase::toJson(m_Complete);
    }

    return val;
}

bool Order::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t("id")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("id"));
        if(!fieldValue.is_null())
        {
            int64_t refVal_id;
            ok &= ModelBase::fromJson(fieldValue, refVal_id);
            setId(refVal_id);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("petId")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("petId"));
        if(!fieldValue.is_null())
        {
            int64_t refVal_petId;
            ok &= ModelBase::fromJson(fieldValue, refVal_petId);
            setPetId(refVal_petId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("quantity")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("quantity"));
        if(!fieldValue.is_null())
        {
            int32_t refVal_quantity;
            ok &= ModelBase::fromJson(fieldValue, refVal_quantity);
            setQuantity(refVal_quantity);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("shipDate")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("shipDate"));
        if(!fieldValue.is_null())
        {
            utility::datetime refVal_shipDate;
            ok &= ModelBase::fromJson(fieldValue, refVal_shipDate);
            setShipDate(refVal_shipDate);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("status")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("status"));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_status;
            ok &= ModelBase::fromJson(fieldValue, refVal_status);
            setStatus(refVal_status);
        }
    }
    if(val.has_field(utility::conversions::to_string_t("complete")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("complete"));
        if(!fieldValue.is_null())
        {
            bool refVal_complete;
            ok &= ModelBase::fromJson(fieldValue, refVal_complete);
            setComplete(refVal_complete);
        }
    }
    return ok;
}

void Order::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }
    if(m_IdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("id"), m_Id));
    }
    if(m_PetIdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("petId"), m_PetId));
    }
    if(m_QuantityIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("quantity"), m_Quantity));
    }
    if(m_ShipDateIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("shipDate"), m_ShipDate));
    }
    if(m_StatusIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("status"), m_Status));
    }
    if(m_CompleteIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("complete"), m_Complete));
    }
}

bool Order::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("id")))
    {
        int64_t refVal_id;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("id")), refVal_id );
        setId(refVal_id);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("petId")))
    {
        int64_t refVal_petId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("petId")), refVal_petId );
        setPetId(refVal_petId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("quantity")))
    {
        int32_t refVal_quantity;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("quantity")), refVal_quantity );
        setQuantity(refVal_quantity);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("shipDate")))
    {
        utility::datetime refVal_shipDate;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("shipDate")), refVal_shipDate );
        setShipDate(refVal_shipDate);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("status")))
    {
        utility::string_t refVal_status;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("status")), refVal_status );
        setStatus(refVal_status);
    }
    if(multipart->hasContent(utility::conversions::to_string_t("complete")))
    {
        bool refVal_complete;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t("complete")), refVal_complete );
        setComplete(refVal_complete);
    }
    return ok;
}

int64_t Order::getId() const
{
    return m_Id;
}

void Order::setId(int64_t value)
{
    m_Id = value;
    m_IdIsSet = true;
}

bool Order::idIsSet() const
{
    return m_IdIsSet;
}

void Order::unsetId()
{
    m_IdIsSet = false;
}
int64_t Order::getPetId() const
{
    return m_PetId;
}

void Order::setPetId(int64_t value)
{
    m_PetId = value;
    m_PetIdIsSet = true;
}

bool Order::petIdIsSet() const
{
    return m_PetIdIsSet;
}

void Order::unsetPetId()
{
    m_PetIdIsSet = false;
}
int32_t Order::getQuantity() const
{
    return m_Quantity;
}

void Order::setQuantity(int32_t value)
{
    m_Quantity = value;
    m_QuantityIsSet = true;
}

bool Order::quantityIsSet() const
{
    return m_QuantityIsSet;
}

void Order::unsetQuantity()
{
    m_QuantityIsSet = false;
}
utility::datetime Order::getShipDate() const
{
    return m_ShipDate;
}

void Order::setShipDate(const utility::datetime& value)
{
    m_ShipDate = value;
    m_ShipDateIsSet = true;
}

bool Order::shipDateIsSet() const
{
    return m_ShipDateIsSet;
}

void Order::unsetShipDate()
{
    m_ShipDateIsSet = false;
}
utility::string_t Order::getStatus() const
{
    return m_Status;
}

void Order::setStatus(const utility::string_t& value)
{
    m_Status = value;
    m_StatusIsSet = true;
}

bool Order::statusIsSet() const
{
    return m_StatusIsSet;
}

void Order::unsetStatus()
{
    m_StatusIsSet = false;
}
bool Order::isComplete() const
{
    return m_Complete;
}

void Order::setComplete(bool value)
{
    m_Complete = value;
    m_CompleteIsSet = true;
}

bool Order::completeIsSet() const
{
    return m_CompleteIsSet;
}

void Order::unsetComplete()
{
    m_CompleteIsSet = false;
}
}
}
}
}


