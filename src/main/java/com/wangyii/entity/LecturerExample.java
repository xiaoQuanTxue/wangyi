package com.wangyii.entity;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class LecturerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LecturerExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andLecturernameIsNull() {
            addCriterion("lecturername is null");
            return (Criteria) this;
        }

        public Criteria andLecturernameIsNotNull() {
            addCriterion("lecturername is not null");
            return (Criteria) this;
        }

        public Criteria andLecturernameEqualTo(String value) {
            addCriterion("lecturername =", value, "lecturername");
            return (Criteria) this;
        }

        public Criteria andLecturernameNotEqualTo(String value) {
            addCriterion("lecturername <>", value, "lecturername");
            return (Criteria) this;
        }

        public Criteria andLecturernameGreaterThan(String value) {
            addCriterion("lecturername >", value, "lecturername");
            return (Criteria) this;
        }

        public Criteria andLecturernameGreaterThanOrEqualTo(String value) {
            addCriterion("lecturername >=", value, "lecturername");
            return (Criteria) this;
        }

        public Criteria andLecturernameLessThan(String value) {
            addCriterion("lecturername <", value, "lecturername");
            return (Criteria) this;
        }

        public Criteria andLecturernameLessThanOrEqualTo(String value) {
            addCriterion("lecturername <=", value, "lecturername");
            return (Criteria) this;
        }

        public Criteria andLecturernameLike(String value) {
            addCriterion("lecturername like", value, "lecturername");
            return (Criteria) this;
        }

        public Criteria andLecturernameNotLike(String value) {
            addCriterion("lecturername not like", value, "lecturername");
            return (Criteria) this;
        }

        public Criteria andLecturernameIn(List<String> values) {
            addCriterion("lecturername in", values, "lecturername");
            return (Criteria) this;
        }

        public Criteria andLecturernameNotIn(List<String> values) {
            addCriterion("lecturername not in", values, "lecturername");
            return (Criteria) this;
        }

        public Criteria andLecturernameBetween(String value1, String value2) {
            addCriterion("lecturername between", value1, value2, "lecturername");
            return (Criteria) this;
        }

        public Criteria andLecturernameNotBetween(String value1, String value2) {
            addCriterion("lecturername not between", value1, value2, "lecturername");
            return (Criteria) this;
        }

        public Criteria andLecturepasswordIsNull() {
            addCriterion("lecturepassword is null");
            return (Criteria) this;
        }

        public Criteria andLecturepasswordIsNotNull() {
            addCriterion("lecturepassword is not null");
            return (Criteria) this;
        }

        public Criteria andLecturepasswordEqualTo(String value) {
            addCriterion("lecturepassword =", value, "lecturepassword");
            return (Criteria) this;
        }

        public Criteria andLecturepasswordNotEqualTo(String value) {
            addCriterion("lecturepassword <>", value, "lecturepassword");
            return (Criteria) this;
        }

        public Criteria andLecturepasswordGreaterThan(String value) {
            addCriterion("lecturepassword >", value, "lecturepassword");
            return (Criteria) this;
        }

        public Criteria andLecturepasswordGreaterThanOrEqualTo(String value) {
            addCriterion("lecturepassword >=", value, "lecturepassword");
            return (Criteria) this;
        }

        public Criteria andLecturepasswordLessThan(String value) {
            addCriterion("lecturepassword <", value, "lecturepassword");
            return (Criteria) this;
        }

        public Criteria andLecturepasswordLessThanOrEqualTo(String value) {
            addCriterion("lecturepassword <=", value, "lecturepassword");
            return (Criteria) this;
        }

        public Criteria andLecturepasswordLike(String value) {
            addCriterion("lecturepassword like", value, "lecturepassword");
            return (Criteria) this;
        }

        public Criteria andLecturepasswordNotLike(String value) {
            addCriterion("lecturepassword not like", value, "lecturepassword");
            return (Criteria) this;
        }

        public Criteria andLecturepasswordIn(List<String> values) {
            addCriterion("lecturepassword in", values, "lecturepassword");
            return (Criteria) this;
        }

        public Criteria andLecturepasswordNotIn(List<String> values) {
            addCriterion("lecturepassword not in", values, "lecturepassword");
            return (Criteria) this;
        }

        public Criteria andLecturepasswordBetween(String value1, String value2) {
            addCriterion("lecturepassword between", value1, value2, "lecturepassword");
            return (Criteria) this;
        }

        public Criteria andLecturepasswordNotBetween(String value1, String value2) {
            addCriterion("lecturepassword not between", value1, value2, "lecturepassword");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}