package cn.lwy.pojo;

import java.util.ArrayList;
import java.util.List;

public class PaperQstExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PaperQstExample() {
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

        public Criteria andCpIdIsNull() {
            addCriterion("cp_id is null");
            return (Criteria) this;
        }

        public Criteria andCpIdIsNotNull() {
            addCriterion("cp_id is not null");
            return (Criteria) this;
        }

        public Criteria andCpIdEqualTo(Integer value) {
            addCriterion("cp_id =", value, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdNotEqualTo(Integer value) {
            addCriterion("cp_id <>", value, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdGreaterThan(Integer value) {
            addCriterion("cp_id >", value, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cp_id >=", value, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdLessThan(Integer value) {
            addCriterion("cp_id <", value, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdLessThanOrEqualTo(Integer value) {
            addCriterion("cp_id <=", value, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdIn(List<Integer> values) {
            addCriterion("cp_id in", values, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdNotIn(List<Integer> values) {
            addCriterion("cp_id not in", values, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdBetween(Integer value1, Integer value2) {
            addCriterion("cp_id between", value1, value2, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cp_id not between", value1, value2, "cpId");
            return (Criteria) this;
        }

        public Criteria andCandidateIdIsNull() {
            addCriterion("candidate_id is null");
            return (Criteria) this;
        }

        public Criteria andCandidateIdIsNotNull() {
            addCriterion("candidate_id is not null");
            return (Criteria) this;
        }

        public Criteria andCandidateIdEqualTo(String value) {
            addCriterion("candidate_id =", value, "candidateId");
            return (Criteria) this;
        }

        public Criteria andCandidateIdNotEqualTo(String value) {
            addCriterion("candidate_id <>", value, "candidateId");
            return (Criteria) this;
        }

        public Criteria andCandidateIdGreaterThan(String value) {
            addCriterion("candidate_id >", value, "candidateId");
            return (Criteria) this;
        }

        public Criteria andCandidateIdGreaterThanOrEqualTo(String value) {
            addCriterion("candidate_id >=", value, "candidateId");
            return (Criteria) this;
        }

        public Criteria andCandidateIdLessThan(String value) {
            addCriterion("candidate_id <", value, "candidateId");
            return (Criteria) this;
        }

        public Criteria andCandidateIdLessThanOrEqualTo(String value) {
            addCriterion("candidate_id <=", value, "candidateId");
            return (Criteria) this;
        }

        public Criteria andCandidateIdLike(String value) {
            addCriterion("candidate_id like", value, "candidateId");
            return (Criteria) this;
        }

        public Criteria andCandidateIdNotLike(String value) {
            addCriterion("candidate_id not like", value, "candidateId");
            return (Criteria) this;
        }

        public Criteria andCandidateIdIn(List<String> values) {
            addCriterion("candidate_id in", values, "candidateId");
            return (Criteria) this;
        }

        public Criteria andCandidateIdNotIn(List<String> values) {
            addCriterion("candidate_id not in", values, "candidateId");
            return (Criteria) this;
        }

        public Criteria andCandidateIdBetween(String value1, String value2) {
            addCriterion("candidate_id between", value1, value2, "candidateId");
            return (Criteria) this;
        }

        public Criteria andCandidateIdNotBetween(String value1, String value2) {
            addCriterion("candidate_id not between", value1, value2, "candidateId");
            return (Criteria) this;
        }

        public Criteria andQstIdIsNull() {
            addCriterion("qst_id is null");
            return (Criteria) this;
        }

        public Criteria andQstIdIsNotNull() {
            addCriterion("qst_id is not null");
            return (Criteria) this;
        }

        public Criteria andQstIdEqualTo(Integer value) {
            addCriterion("qst_id =", value, "qstId");
            return (Criteria) this;
        }

        public Criteria andQstIdNotEqualTo(Integer value) {
            addCriterion("qst_id <>", value, "qstId");
            return (Criteria) this;
        }

        public Criteria andQstIdGreaterThan(Integer value) {
            addCriterion("qst_id >", value, "qstId");
            return (Criteria) this;
        }

        public Criteria andQstIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("qst_id >=", value, "qstId");
            return (Criteria) this;
        }

        public Criteria andQstIdLessThan(Integer value) {
            addCriterion("qst_id <", value, "qstId");
            return (Criteria) this;
        }

        public Criteria andQstIdLessThanOrEqualTo(Integer value) {
            addCriterion("qst_id <=", value, "qstId");
            return (Criteria) this;
        }

        public Criteria andQstIdIn(List<Integer> values) {
            addCriterion("qst_id in", values, "qstId");
            return (Criteria) this;
        }

        public Criteria andQstIdNotIn(List<Integer> values) {
            addCriterion("qst_id not in", values, "qstId");
            return (Criteria) this;
        }

        public Criteria andQstIdBetween(Integer value1, Integer value2) {
            addCriterion("qst_id between", value1, value2, "qstId");
            return (Criteria) this;
        }

        public Criteria andQstIdNotBetween(Integer value1, Integer value2) {
            addCriterion("qst_id not between", value1, value2, "qstId");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNull() {
            addCriterion("answer is null");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNotNull() {
            addCriterion("answer is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerEqualTo(String value) {
            addCriterion("answer =", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotEqualTo(String value) {
            addCriterion("answer <>", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThan(String value) {
            addCriterion("answer >", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("answer >=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThan(String value) {
            addCriterion("answer <", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThanOrEqualTo(String value) {
            addCriterion("answer <=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLike(String value) {
            addCriterion("answer like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotLike(String value) {
            addCriterion("answer not like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerIn(List<String> values) {
            addCriterion("answer in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotIn(List<String> values) {
            addCriterion("answer not in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerBetween(String value1, String value2) {
            addCriterion("answer between", value1, value2, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotBetween(String value1, String value2) {
            addCriterion("answer not between", value1, value2, "answer");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Byte value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Byte value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Byte value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Byte value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Byte value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Byte value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Byte> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Byte> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Byte value1, Byte value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Byte value1, Byte value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andMarkingIsNull() {
            addCriterion("marking is null");
            return (Criteria) this;
        }

        public Criteria andMarkingIsNotNull() {
            addCriterion("marking is not null");
            return (Criteria) this;
        }

        public Criteria andMarkingEqualTo(Byte value) {
            addCriterion("marking =", value, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingNotEqualTo(Byte value) {
            addCriterion("marking <>", value, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingGreaterThan(Byte value) {
            addCriterion("marking >", value, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingGreaterThanOrEqualTo(Byte value) {
            addCriterion("marking >=", value, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingLessThan(Byte value) {
            addCriterion("marking <", value, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingLessThanOrEqualTo(Byte value) {
            addCriterion("marking <=", value, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingIn(List<Byte> values) {
            addCriterion("marking in", values, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingNotIn(List<Byte> values) {
            addCriterion("marking not in", values, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingBetween(Byte value1, Byte value2) {
            addCriterion("marking between", value1, value2, "marking");
            return (Criteria) this;
        }

        public Criteria andMarkingNotBetween(Byte value1, Byte value2) {
            addCriterion("marking not between", value1, value2, "marking");
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